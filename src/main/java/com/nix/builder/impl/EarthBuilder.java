package com.nix.builder.impl;

import com.nix.builder.AbstractBuilder;
import com.nix.data.Earth;

public class EarthBuilder implements AbstractBuilder<Earth> {
    private Earth earth = Earth.getInstance();

    @Override
    public void build() {
        String[] earthProperties = getKeyValueMapByBundleProperties().get("earth").split(";");
        earth.setWeight(Double.parseDouble(earthProperties[0]));
        earth.setRadius(Double.parseDouble(earthProperties[1]));
    }
}
