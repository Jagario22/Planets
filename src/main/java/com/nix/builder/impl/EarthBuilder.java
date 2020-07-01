package com.nix.builder.impl;

import com.nix.builder.AbstractBuilder;
import com.nix.builder.util.EarthBundleUtil;
import com.nix.data.Earth;
import com.nix.data.Mars;

import java.math.BigDecimal;
import java.util.Map;

public class EarthBuilder implements AbstractBuilder<Earth> {
    private Earth earth = Earth.getInstance();

    @Override
    public Map<String, String> getKeyValueMapByBundleProperties() {
        return EarthBundleUtil.getBundleProperties("earth");
    }

    @Override
    public void build() {
        Map<String, String> properties = getKeyValueMapByBundleProperties();
        earth.setRadius(Double.parseDouble(properties.get("radius")));
        earth.setWeight(Double.parseDouble(properties.get("weight")));
    }
}
