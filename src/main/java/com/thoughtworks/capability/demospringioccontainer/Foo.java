package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {

    @Autowired
    private Bar bar;

//    public Foo(Bar bar) {
//        this.bar = bar;
//    }

    @PostConstruct
    public void init() {
        bar.setFoo(this);
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
