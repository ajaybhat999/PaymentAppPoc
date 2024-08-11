package com.lbg.poc.controller;



import com.lbg.poc.model.DataConsumerCatalogue;

import com.lbg.poc.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


/*
Rest controller.
 */
@RestController
@RequestMapping("${microservice.contextPath}")
@Slf4j
@CrossOrigin(origins="*")
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value="/consumer/catalogue/{id}")
    public ResponseEntity getAllExpenses(@PathVariable("id")Integer id ){
        DataConsumerCatalogue expenses = consumerService.getDataConsumerCatalogue(id);
        return new ResponseEntity<DataConsumerCatalogue>(expenses,HttpStatus.OK);
    }

    @PostMapping(value="/consumer/catalogue")
    public ResponseEntity getAllCategories(@RequestBody DataConsumerCatalogue req){
        DataConsumerCatalogue consumerCatalogue = consumerService.saveDataConsumerCatalogue(req);
        return new ResponseEntity(consumerCatalogue,HttpStatus.OK);
    }


}


