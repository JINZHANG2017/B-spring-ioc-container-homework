package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    public GreetingController() {

    }

    @GetMapping("/greet")
    public String greet() {
        this.greetingService = (GreetingService) SpringContextUtil.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
