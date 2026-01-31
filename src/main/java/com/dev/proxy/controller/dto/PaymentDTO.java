package com.dev.proxy.controller.dto;

import java.math.BigDecimal;

// Representa as informações do pagamento enviadas pelo WEBHOOK do ASAAS
public record PaymentDTO(
        String id,
        String status,
        BigDecimal value,
        BigDecimal netValue,
        String billingType,
        String confirmedDate,
        String clientPaymentDate,
        String customer,
        String invoiceUrl
) { }