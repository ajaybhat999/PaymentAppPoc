package com.lbg.poc.service;


import com.lbg.poc.model.PaymentHistory;
import com.lbg.poc.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class PaymentService {

    //Use Repo in case of actual data
    @Autowired
    PaymentRepository paymentRepository;

    public List<String> getAllPayments() {
        //Mocked up values
        return Arrays.asList("Visa","MasterCard","NFC");
    }

    public List<PaymentHistory> getPaymentHistory(String customerId) {
        log.info("customer id passed is {}",customerId);
        //Mocked up data
        List<PaymentHistory> paymentHistoryList = new ArrayList<>();
        PaymentHistory paymentHistory = new PaymentHistory();
        paymentHistory.setPaymentId("1");
        paymentHistory.setPaymentType("VISA");
        paymentHistory.setAmount(Double.valueOf("32"));
        paymentHistory.setStatus("SUCCESS");
        paymentHistoryList.add(paymentHistory);

        //return the list
        return paymentHistoryList;
    }
}
