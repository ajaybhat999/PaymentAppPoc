package com.lbg.poc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity

public class DataEntityCatalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer entityId;
    private String name;
    private String type;
    private String classification;
    private String persistenceLayer;
    private String publishingFrequency;
    private String publishingType;
    private String dataOwner;
    private String backupDataOwner;
    private String primaryDataSteward;
    private String backupDataSteward;
    private String backupDataArchitect;
    private String dataArchitect;
    private String entityGDMLink;
    private String entityCollbraLink;
    private Integer lastPublishedVersion;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="entity_id")
    private Set<DataAttributeCatalogue> dataAttributeCatalogueSet;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "entity_id")
   private Set<DataQualityCatalogue> dataQualityCatalogues;


}
