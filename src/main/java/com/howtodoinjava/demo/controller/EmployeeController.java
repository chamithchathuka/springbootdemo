package com.howtodoinjava.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class EmployeeController {

	@RequestMapping("/")
    public String hello()
    {
      RestTemplate restTemplate = new RestTemplate();
      String fooResourceUrl
          = "http://192.168.96.2";
      ResponseEntity<String> response
          = restTemplate.getForEntity(fooResourceUrl, String.class);

		return response.getBody();
    }

    @RequestMapping("/hello")
    public String hellow()
    {

		return "Hello";
    }

}
