package com.elitlabs.mtit.microservcie.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void createOrder(){

    }
}



