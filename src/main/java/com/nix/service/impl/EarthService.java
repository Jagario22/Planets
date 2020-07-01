package com.nix.service.impl;

import com.nix.annotation.Service;
import com.nix.data.Earth;
import com.nix.service.PlanetService;

@Service
public class EarthService implements PlanetService<Earth> {
    Earth earth = Earth.getInstance();

    public Double getAccelerationOfGravity() {
        return earth.getGravity() * (earth.getWeight() / Math.pow(earth.getRadius(), 2));
    }
}
