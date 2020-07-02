package com.nix.builder.impl;

import com.nix.builder.AbstractBuilder;
import com.nix.data.Mars;

import java.util.Map;

public class MarsBuilder implements AbstractBuilder<Mars> {
    private Mars mars = Mars.getInstance();

    @Override
    public void build() {
        String[] earthProperties = getKeyValueMapByBundleProperties().get("mars").split(";");
        mars.setWeight(Double.parseDouble(earthProperties[0]));
        mars.setRadius(Double.parseDouble(earthProperties[1]));
    }
}
