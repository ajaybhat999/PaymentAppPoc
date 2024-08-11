package com.lbg.poc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity

public class DataProducerCatalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer producerId;
    private String producerName;
    private String BUName;
    private String subcategoryBU;
    private String primaryPoc;
    private String secondaryPoc;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="producer_id")
    private Set<DataEntityCatalogue> dataEntityCatalogueSet;



}
