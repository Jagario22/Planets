package com.nix.config;

import com.nix.annotation.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {

    private ObjectFactory factory;
    private Map<Class, Object> cacheMap = new ConcurrentHashMap<>();
    private ApplicationConfiguration config;

    public ApplicationContext(ApplicationConfiguration configuration) {
        this.config = configuration;
    }

    public <T> T getObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (cacheMap.containsKey(type)) {
            return (T) cacheMap.get(type);
        }
        if (type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t = factory.createObject(implClass);
        if (implClass.isAnnotationPresent(Service.class)) {
            cacheMap.put(type, t);
        }
        return t;
    }

    public void setFactory(ObjectFactory factory) {
        this.factory = factory;
    }

    public ApplicationConfiguration getConfig() {
        return config;
    }
}
