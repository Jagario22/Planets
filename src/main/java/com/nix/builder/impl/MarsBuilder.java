package com.nix.builder.impl;

import com.nix.builder.AbstractBuilder;
import com.nix.builder.util.EarthBundleUtil;
import com.nix.data.Mars;

import java.util.Map;

public class MarsBuilder implements AbstractBuilder<Mars> {
    private Mars mars = Mars.getInstance();

    @Override
    public Map<String, String> getKeyValueMapByBundleProperties() {
        return EarthBundleUtil.getBundleProperties("mars");
    }

    @Override
    public void build() {
        Map<String, String> properties = getKeyValueMapByBundleProperties();
        mars.setRadius(Double.parseDouble(properties.get("radius")));
        mars.setWeight(Double.parseDouble(properties.get("weight")));
    }
}
