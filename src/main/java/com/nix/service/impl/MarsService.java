package com.nix.service.impl;

import com.nix.annotation.Service;
import com.nix.data.Earth;
import com.nix.data.Mars;
import com.nix.service.PlanetService;

import java.math.BigDecimal;

@Service
public class MarsService implements PlanetService {
    Mars mars = Mars.getInstance();

    @Override
    public Double getAccelerationOfGravity() {

        return mars.getGravity() * (mars.getWeight() / Math.pow(mars.getRadius(), 2));
    }
}
