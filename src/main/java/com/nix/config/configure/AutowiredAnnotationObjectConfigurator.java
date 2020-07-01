package com.nix.config.configure;


import com.nix.annotation.Autowired;
import com.nix.config.ApplicationContext;
import com.nix.config.ObjectConfigurator;

import java.lang.reflect.Field;

public class AutowiredAnnotationObjectConfigurator implements ObjectConfigurator {

    @Override
    public void configure(Object o, ApplicationContext context) {
        for (Field field : o.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Autowired.class)) {
                field.setAccessible(true);
                Object o1 = context.getObject(field.getType());
                try {
                    field.set(o, o1);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Возникли проблемы с инициализацией филда: " + e.getMessage());
                }
            }
        }
    }
}
