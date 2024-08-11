package com.lbg.poc.model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity

public class DataConsumerCatalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer consumerId;
    private String consumerName;
    private String BUName;
    private String subcategoryBU;
    private String primaryPoc;
    private String secondaryPoc;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="consumer_id")
    private Set<ConsumerAccessLog> consumerAccessLogSet;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="consumer_id")
    private Set<ConsumerEntitlementCatalogue> consumerEntitlementCatalogueSet;



}
