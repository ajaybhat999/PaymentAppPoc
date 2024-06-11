package com.lbg.poc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
The Main application Class.
 */
@SpringBootApplication
@Slf4j
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
        log.info("Payment application started!");
    }
}
