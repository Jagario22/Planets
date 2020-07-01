package com.nix.data;

import com.nix.data.abstr.Planet;

public class Earth extends Planet {
    private static Earth instance;

    private Earth() {}

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
