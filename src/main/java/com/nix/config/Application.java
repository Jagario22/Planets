package com.nix.config;

import com.nix.config.impl.JavaApplicationConfiguration;

import java.util.Map;

public class Application {

    public static ApplicationContext run(String packageToScan, Map<Class, Class> mapImpl) {
        JavaApplicationConfiguration javaApplicationConfiguration = new JavaApplicationConfiguration(packageToScan, mapImpl);
        ApplicationContext context = new ApplicationContext(javaApplicationConfiguration);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setFactory(objectFactory);
        return context;
    }
}