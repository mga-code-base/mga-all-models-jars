package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record TargetMuscleWrapper(List<String> allExcercises) implements Serializable {

    public TargetMuscleWrapper {
        allExcercises = allExcercises != null ? allExcercises : List.of();
    }

    public static TargetMuscleWrapper empty() {
        return new TargetMuscleWrapper(List.of());
    }
}
