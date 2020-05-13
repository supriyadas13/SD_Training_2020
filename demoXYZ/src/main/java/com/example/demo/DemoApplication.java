package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
  SpringApplication.run(DemoApplication.class, args);
  }

  @RequestMapping("/coal-mine")
    public String coalMine() {
      return "Tweet";
    }


  @RequestMapping("/hello")
    public String hello(){
        return "value : Hello World";
    }
/*
  @RequestMapping(“/hello”)
  public String hello(
      @RequestHeader(value=“Accept”) String accept)
      {
        System.out.println(“accept: ” + accept);
        if(accept==“application/JSON“)
        {
          return “{\“value\” : \“Hello World\” } “;
        }
        else
        {
          return “<value>Hello World</value>“;
        }
      }
*/
  @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
            return "Hello" + name;
    }

  

}
