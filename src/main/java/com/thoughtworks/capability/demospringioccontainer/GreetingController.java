package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    private WebApplicationContext webApplicationContext;


    @GetMapping("/greet")
    public String greet() {
        this.greetingService = webApplicationContext.getBean(GreetingService.class);
        //(GreetingService) SpringContextUtil.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
