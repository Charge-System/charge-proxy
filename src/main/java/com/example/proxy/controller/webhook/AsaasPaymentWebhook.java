package com.example.proxy.controller.webhook;

import com.example.proxy.controller.dto.AsaasWebhookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asaas/webhook")
public class AsaasPaymentWebhook {

    @PostMapping
    public ResponseEntity<Void> webhook(@RequestBody AsaasWebhookDTO asaasWebhookDTO) {
        return ResponseEntity.status(HttpStatus.OK).build();

        //ADICIONAR EVENTO COM AS INFORMAÇÕES DO RABBITMQ NA FILA DO RABBITMQ
    }
}
