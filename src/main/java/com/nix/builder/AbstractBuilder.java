package com.nix.builder;

import com.nix.builder.util.PlanetBundleUtil;
import com.nix.data.abstr.Planet;

import java.util.Map;

public interface AbstractBuilder<T extends Planet> {
    default Map<String, String> getKeyValueMapByBundleProperties() {
        return PlanetBundleUtil.getBundleProperties("planets");
    }

    void build();
}
