package com.nix.data.abstr;

import java.math.BigDecimal;

public abstract class Planet {
    private Double radius;
    private final Double gravity = 6.6720 * Math.pow(10,-11);
    private Double weight;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getGravity() {
        return gravity;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
