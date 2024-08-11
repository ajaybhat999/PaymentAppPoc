package com.lbg.poc.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lbg.poc.model.DataConsumerCatalogue;
import com.lbg.poc.repository.DataConsumerCatalogueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
@Slf4j
public class ConsumerService {

    //Use Repo in case of actual data
    @Autowired
    DataConsumerCatalogueRepository dataConsumerCatalogueRepository;

    @Autowired
    ObjectMapper mapper;

    public DataConsumerCatalogue saveDataConsumerCatalogue(DataConsumerCatalogue req) {
        return dataConsumerCatalogueRepository.save(req);
    }

    public DataConsumerCatalogue getDataConsumerCatalogue(Integer id) {
        return dataConsumerCatalogueRepository.findOne(id);
    }

}
