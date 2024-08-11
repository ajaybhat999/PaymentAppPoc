package com.lbg.poc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity

public class DataAttributeCatalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer attributeId;
    private String attributeName;
    private String attributeDataType;
    private String attributeNullable;




}
