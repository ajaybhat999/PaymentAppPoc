package com.lbg.poc.service;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaymentService {

    public List<String> getAllPayments() {
        return Arrays.asList("Payment1","Payment2");
    }
}
