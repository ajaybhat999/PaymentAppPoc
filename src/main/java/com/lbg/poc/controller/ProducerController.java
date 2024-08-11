package com.lbg.poc.controller;


import com.lbg.poc.model.DataConsumerCatalogue;
import com.lbg.poc.model.DataProducerCatalogue;
import com.lbg.poc.service.ConsumerService;
import com.lbg.poc.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*
Rest controller.
 */
@RestController
@RequestMapping("${microservice.contextPath}")
@Slf4j
@CrossOrigin(origins="*")
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @GetMapping(value="/producer/catalogue/{id}")
    public ResponseEntity getAllExpenses(@PathVariable("id")Integer id ){
        DataProducerCatalogue producerCatalogue = producerService.getDataProducerCatalogue(id);
        return new ResponseEntity<DataProducerCatalogue>(producerCatalogue,HttpStatus.OK);
    }

    @PostMapping(value="/producer/catalogue")
    public ResponseEntity getAllCategories(@RequestBody DataProducerCatalogue req){
        DataProducerCatalogue producerCatalogue = producerService.saveDataProducerCatalogue(req);
        return new ResponseEntity(producerCatalogue,HttpStatus.OK);
    }


}


