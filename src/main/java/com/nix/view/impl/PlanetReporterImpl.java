package com.nix.view.impl;

import com.nix.annotation.Autowired;
import com.nix.service.PlanetService;
import com.nix.view.PlanetReporter;


public class PlanetReporterImpl implements PlanetReporter {

    @Autowired
    private PlanetService planetService;

    @Override
    public void print() {
        System.out.println("The gravity acceleration: " + planetService.getAccelerationOfGravity());
    }

}
