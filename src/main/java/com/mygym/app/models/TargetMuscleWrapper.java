package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record TargetMuscleWrapper(List<String> allExcercises) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public TargetMuscleWrapper {
        allExcercises = allExcercises != null ? allExcercises : List.of();
    }

    public static TargetMuscleWrapper empty() {
        return new TargetMuscleWrapper(List.of());
    }
}
