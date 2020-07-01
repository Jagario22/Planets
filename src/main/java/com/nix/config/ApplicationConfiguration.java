package com.nix.config;

import org.reflections.Reflections;

public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
    Reflections getScanner();
}
