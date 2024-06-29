package com.lbg.poc.controller;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lbg.poc.model.Category;
import com.lbg.poc.model.Expense;

import com.lbg.poc.service.ExpenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
Rest controller.
 */
@RestController
@RequestMapping("${microservice.contextPath}")
@Slf4j
@CrossOrigin(origins="*")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping(value="/expenses")
    public ResponseEntity getAllExpenses(){
        List<Expense> expenses = expenseService.getAllExpenses();
        return new ResponseEntity<List<Expense>>(expenses,HttpStatus.OK);
    }

    @GetMapping(value="/categories")
    public ResponseEntity getAllCategories(){
        List<Category> categories = expenseService.getAllCategories();
        return new ResponseEntity<List<Category>>(categories,HttpStatus.OK);
    }

    @GetMapping(value="/expenses-subcategory")
    public ResponseEntity getAllExpensesBySubCategory() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/subcategories.json");

        JsonNode json = mapper.readTree(inputStream);
        return ResponseEntity.ok(json);
    }
}


