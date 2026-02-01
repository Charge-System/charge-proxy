package com.dev.proxy.controller;

import com.dev.proxy.controller.dto.AsaasWebhookDTO;
import com.dev.proxy.controller.dto.MessageQueueDTO;
import com.dev.proxy.controller.dto.PaymentDTO;
import com.dev.proxy.service.QueueProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/asaas/webhook")
public class AsaasPaymentWebhook {

    // Serviço de envio de mensagem RABBITMQ
    private final QueueProducer queueProducer;

    public AsaasPaymentWebhook(QueueProducer queueProducer) {
        this.queueProducer = queueProducer;
    }

    @PostMapping
    public ResponseEntity<String> webhook(@RequestBody AsaasWebhookDTO asaasWebhookDTO) {
        // Obtendo informações e adicionando na fila
        PaymentDTO paymentDTO = asaasWebhookDTO.payment();

        MessageQueueDTO mensagemEnviar = new MessageQueueDTO(paymentDTO.id(), paymentDTO.status());

        ObjectMapper objectMapper = new ObjectMapper();
        queueProducer.enviarMensageFila(objectMapper.writeValueAsString(mensagemEnviar));

        return ResponseEntity.status(HttpStatus.OK).body("Mensagem enviada com sucesso");

    }
}
