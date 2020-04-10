package com.elitlabs.mtit.microservice.accountservice.accountservice.controller;

import com.elitlabs.mtit.microservice.accountservice.accountservice.dto.UserRequest;
import com.elitlabs.mtit.microservice.accountservice.accountservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class OrderController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody UserResponse createUser(@RequestBody UserRequest userRequest){

        System.out.println("User Details : " + userRequest);

        var userResponse = new UserResponse();

        userResponse.setUserId(UUID.randomUUID().toString());

        userResponse.setMessage("Successfully created the user");

        return userResponse;

    }
}
