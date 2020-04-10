package com.elitlabs.mtit.microservice.accountservice.accountservice.dto;

public class UserRequest {

    private String userId;
    private String fullName;
    private String age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
