package com.lbg.poc.repository;

import com.lbg.poc.model.DataProducerCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataProducerCatalogueRepository extends JpaRepository<DataProducerCatalogue,Integer> {

}
