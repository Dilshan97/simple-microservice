package com.elitlabs.mtit.microservice.accountservice.accountservice.dto;

/**
 *
 */
public class UserRequest {

    private String fullName;
    private String age;

    /**
     * @return
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "UserRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
