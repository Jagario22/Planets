package com.nix.builder;

import com.nix.builder.util.EarthBundleUtil;
import com.nix.data.abstr.Planet;

import java.util.Map;

public interface AbstractBuilder<T extends Planet> {
    Map<String, String> getKeyValueMapByBundleProperties();
    void build();
}
