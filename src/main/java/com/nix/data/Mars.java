package com.nix.data;

import com.nix.data.abstr.Planet;

public class Mars extends Planet {
    private static Mars instance;

    private Mars() {}

    public static Mars getInstance() {
        if (instance == null) {
            instance = new Mars();
        }
        return instance;
    }

}
