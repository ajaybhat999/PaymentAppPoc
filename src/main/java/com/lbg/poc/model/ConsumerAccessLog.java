package com.lbg.poc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Setter
@Getter
@Entity

public class ConsumerAccessLog {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   private Integer entityId;
   private Timestamp accessedTimestamp;



}
