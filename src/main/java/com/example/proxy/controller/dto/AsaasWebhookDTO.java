package com.example.proxy.controller.dto;

// DTO que será utilizado pra receber as informações do WEBHOOK do ASAAS
public record AsaasWebhookDTO(String event, PaymentDTO payment) { }
