package com.lbg.poc.controller;


import com.lbg.poc.model.PaymentHistory;
import com.lbg.poc.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Rest controller.
 */
@RestController
@RequestMapping("${microservice.contextPath}")
@Slf4j
@CrossOrigin(origins="*")
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    /*
    Rest Controller to get All payments type.
     */
    @GetMapping(value="/payments")
    public ResponseEntity getAllPayments(){
        log.debug("Entering getAllJobs Method");
        List<String> paymentList =paymentService.getAllPayments();
        return new ResponseEntity<List<String>>(paymentList,HttpStatus.OK);
    }


    @GetMapping(value="/payments/history/{customerId}")
    public ResponseEntity getPaymentHistory(@PathVariable String customerId){
        log.debug("Entering getAllJobs Method");
        List<PaymentHistory> paymentHistoryList =paymentService.getPaymentHistory(customerId);
        return new ResponseEntity<List<PaymentHistory>>(paymentHistoryList,HttpStatus.OK);
    }






}


