package com.javahonk;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class RESTFulServiceConsumer {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        String consumeJSONString = restTemplate.getForObject("http://localhost:8080/employee/getAll", String.class);
        System.out.println("*************************************************************");
        System.out.println("JSON String: "+consumeJSONString); 
        System.out.println("*************************************************************");
        consumeJSONString = restTemplate.getForObject("http://localhost:8080/employee/get/3", String.class);
        System.out.println("*************************************************************");
        System.out.println("JSON String: "+consumeJSONString);
        System.out.println("*************************************************************");
        
        Employee e=new Employee(9,"first name","last name","email");
        consumeJSONString = restTemplate.postForObject("http://localhost:8080/employee",e, String.class);
        System.out.println("*************************************************************");
        System.out.println("Post JSON String: "+consumeJSONString);
        System.out.println("*************************************************************");
         }

}