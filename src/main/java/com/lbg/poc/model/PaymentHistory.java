package com.lbg.poc.model;


import lombok.Data;

@Data
public class PaymentHistory {

    String paymentId;
    String paymentType;
    Double amount;
    String status;
}
