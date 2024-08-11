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

public class DataQualityCatalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer consumerId;

    private String consumerName;
    private String BUName;
    private String subcategoryBU;
    private String primaryPoc;
    private String secondaryPoc;



}
