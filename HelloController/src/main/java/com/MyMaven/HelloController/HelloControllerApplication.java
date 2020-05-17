package com.MyMaven.HelloController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloControllerApplication.class, args);
	}

	@Autowired
	private NameStoreService nameStoreService;

	@RequestMapping("/coal-mine")
    public String coalMine() {
      return "Tweet*&*&";
    }


  @RequestMapping("/hello")
    public String hello(){
        return "value : Hello World";
    }

  @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
            return "Hello" + name;
    }

  @RequestMapping(value = "/helloadd/{name}", method = RequestMethod.POST)
	public String addName(@PathVariable String name) {
		nameStoreService.saveName(name);
		return name + "saved";
	}

  @RequestMapping(value="/hellofind")
	public List<String> listNames() {
		return nameStoreService.listNames();
	}

   
}
