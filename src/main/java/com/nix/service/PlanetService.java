package com.nix.service;

import com.nix.data.abstr.Planet;

import java.math.BigDecimal;

public interface PlanetService<L extends Planet> {
    Double getAccelerationOfGravity();
}
