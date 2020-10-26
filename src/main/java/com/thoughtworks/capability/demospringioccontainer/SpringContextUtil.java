package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.ConfigurableApplicationContext;

public class SpringContextUtil {
    private static ConfigurableApplicationContext context;

    public static void setApplicationContext(ConfigurableApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static Object getBean(Class clazz){
        return context.getBean(clazz);
    }
}
