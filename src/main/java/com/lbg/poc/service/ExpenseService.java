package com.lbg.poc.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lbg.poc.model.Category;
import com.lbg.poc.model.Expense;
import com.lbg.poc.repository.ExpenseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
@Slf4j
public class ExpenseService {

    //Use Repo in case of actual data
    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    ObjectMapper mapper;

    public List<Expense> getAllExpenses() {
        TypeReference<List<Expense>> typeReference = new TypeReference<List<Expense>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/expenses.json");
        List<Expense> expenses = null;
        try {
              expenses = mapper.readValue(inputStream,typeReference);
        } catch (IOException e){
            log.error("Unable get expense details: " + e.getMessage());
        }
        return expenses;
    }

    public List<Category> getAllCategories(){
        TypeReference<List<Category>> typeReference = new TypeReference<List<Category>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/categories.json");
        List<Category> categories = null;
        try {
            categories = mapper.readValue(inputStream,typeReference);
        } catch (IOException e){
            log.error("Unable get categories details: " + e.getMessage());
        }
        return categories;
    }

}
