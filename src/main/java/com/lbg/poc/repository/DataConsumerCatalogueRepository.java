package com.lbg.poc.repository;

import com.lbg.poc.model.DataConsumerCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataConsumerCatalogueRepository  extends JpaRepository<DataConsumerCatalogue,Integer> {

}
