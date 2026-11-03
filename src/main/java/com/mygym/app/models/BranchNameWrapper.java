package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

public record BranchNameWrapper(Map<String, String> allBrancheNames) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public BranchNameWrapper {
        allBrancheNames = allBrancheNames != null ? allBrancheNames : Map.of();
    }

    public static BranchNameWrapper empty() {
        return new BranchNameWrapper(Map.of());
    }
}
