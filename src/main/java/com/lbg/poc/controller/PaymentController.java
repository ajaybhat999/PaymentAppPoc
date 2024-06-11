package com.lbg.poc.controller;


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
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    /*
    Rest Controller to get All jobs.
     */
    @GetMapping(value="/payments")
    public ResponseEntity getAllJobs(){
        log.debug("Entering getAllJobs Method");
        List<String> jobList =paymentService.getAllPayments();
        return new ResponseEntity<List<String>>(jobList,HttpStatus.OK);
    }





}


