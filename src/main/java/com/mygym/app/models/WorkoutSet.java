package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.PositiveOrZero;

public record WorkoutSet(
        @PositiveOrZero Float weight,
        String scaleType,
        @PositiveOrZero Integer reps,
        List<@Valid WorkoutSet> subsets) implements Serializable {
}
