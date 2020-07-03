package com.nix.service.impl;

import com.nix.annotation.Autowired;
import com.nix.annotation.Service;
import com.nix.service.PlanetService;
import com.nix.service.PlanetReporter;

@Service
public class PlanetReporterImpl implements PlanetReporter {

    @Autowired
    private PlanetService planetService;

    @Override
    public void print() {
        System.out.println("The gravity acceleration: " + planetService.getAccelerationOfGravity());
    }

}
