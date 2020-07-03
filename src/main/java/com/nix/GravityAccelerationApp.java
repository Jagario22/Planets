package com.nix;

import com.nix.builder.AbstractBuilder;
import com.nix.builder.impl.MarsBuilder;
import com.nix.config.Application;
import com.nix.config.ApplicationContext;
import com.nix.service.PlanetService;
import com.nix.service.impl.MarsService;
import com.nix.service.PlanetReporter;

import java.util.HashMap;
import java.util.Map;

public class GravityAccelerationApp {

    public static void main(String[] args) {

        ApplicationContext context = Application.run("com.nix",
                new HashMap<>(Map.of(PlanetService.class, MarsService.class, AbstractBuilder.class, MarsBuilder.class)));
        PlanetReporter planetReporter = context.getObject(PlanetReporter.class);
        AbstractBuilder dataBuilder = context.getObject(AbstractBuilder.class);
        dataBuilder.build();
        planetReporter.print();
    }
}
