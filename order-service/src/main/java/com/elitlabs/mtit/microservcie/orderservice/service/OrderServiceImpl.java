package com.elitlabs.mtit.microservcie.orderservice.service;

import com.elitlabs.mtit.microservcie.orderservice.dto.OrderRequest;
import com.elitlabs.mtit.microservcie.orderservice.dto.OrderResponse;
import com.elitlabs.mtit.microservcie.orderservice.dto.UserCreationRequest;
import com.elitlabs.mtit.microservcie.orderservice.dto.UserCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

        var userCreation = new UserCreationRequest();

        userCreation.setFullName(orderRequest.getFullName());

        userCreation.setAge(orderRequest.getAge());

        ResponseEntity<UserCreationResponse> userCreationResponse = restTemplate.postForEntity("http://localhost:8080/users", userCreation, UserCreationResponse.class);

        var orderResponse = new OrderResponse();

        orderResponse.setOrderId(userCreationResponse.getBody().getUserId());

        orderResponse.setMessage("successfully created order");

        return orderResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
