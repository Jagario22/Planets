package com.nix.builder.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public final class PlanetBundleUtil {


    public static Map<String, String> getBundleProperties(String fileName) {
        return convertResourceBundleToMap(ResourceBundle.getBundle(fileName));
    }

    private static Map<String, String> convertResourceBundleToMap(ResourceBundle resource) {
        Map<String, String> map = new HashMap<String, String>();
        Enumeration<String> keys = resource.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            map.put(key, resource.getString(key));
        }
        return map;
    }

}