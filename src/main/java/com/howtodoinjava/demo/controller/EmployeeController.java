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
          = "https://run.mocky.io/v3/b1617f22-6e42-43fa-870c-64466c5900e4";
      ResponseEntity<String> response
          = restTemplate.getForEntity(fooResourceUrl, String.class);

		return response.getBody();
    }

}
