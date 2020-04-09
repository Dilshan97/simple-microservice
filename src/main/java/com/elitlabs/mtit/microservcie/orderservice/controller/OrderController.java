package com.elitlabs.mtit.microservcie.orderservice.controller;

import com.elitlabs.mtit.microservcie.orderservice.dto.OrderRequest;
import com.elitlabs.mtit.microservcie.orderservice.dto.OrderResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request){

        System.out.println("Order Details :  " + request);

        var orderResponse = new OrderResponse();

        orderResponse.setOrderId(UUID.randomUUID().toString());

        orderResponse.setMessage("successfully created order");

        return orderResponse;
    }

}



