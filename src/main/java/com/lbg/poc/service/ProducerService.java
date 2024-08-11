package com.lbg.poc.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.lbg.poc.model.DataConsumerCatalogue;
import com.lbg.poc.model.DataProducerCatalogue;
import com.lbg.poc.repository.DataConsumerCatalogueRepository;
import com.lbg.poc.repository.DataProducerCatalogueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerService {

    //Use Repo in case of actual data
    @Autowired
    DataProducerCatalogueRepository dataProducerCatalogueRepository;

    @Autowired
    ObjectMapper mapper;

    public DataProducerCatalogue saveDataProducerCatalogue(DataProducerCatalogue req) {
        return dataProducerCatalogueRepository.save(req);
    }

    public DataProducerCatalogue getDataProducerCatalogue(Integer id) {
        return dataProducerCatalogueRepository.findOne(id);
    }

}
