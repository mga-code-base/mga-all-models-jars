package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

public record WorkoutSet(
        Float weight,
        String scaleType,
        Integer reps,
        List<WorkoutSet> subsets) implements Serializable {
}
