package com.firstone.pm.posapp.model;

import com.firstone.pm.posapp.domain.PaymentType;
import lombok.Data;

@Data
public class PaymentSummary {

    private PaymentType paymentType;

    private Double totalAmount;

    private int transactionCount;

    private double percentage;
}
