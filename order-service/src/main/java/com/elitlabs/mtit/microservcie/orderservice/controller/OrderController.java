package com.elitlabs.mtit.microservcie.orderservice.controller;

import com.elitlabs.mtit.microservcie.orderservice.dto.OrderRequest;
import com.elitlabs.mtit.microservcie.orderservice.dto.OrderResponse;
import com.elitlabs.mtit.microservcie.orderservice.dto.UserCreationRequest;
import com.elitlabs.mtit.microservcie.orderservice.dto.UserCreationResponse;
import com.elitlabs.mtit.microservcie.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request){

        System.out.println("Order Details :  " + request);

        return orderService.createOrder(request);

    }

}



