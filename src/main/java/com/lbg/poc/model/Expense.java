package com.lbg.poc.model;

import lombok.Data;

@Data
public class Expense {
    String itemAmount;
    String expenseDate;
    String itemName;
    String category;
    boolean isDeleted;
    String id;

}
