package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record TrainerWrapper(List<Trainer> allTrainers) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public TrainerWrapper {
        allTrainers = allTrainers != null ? allTrainers : List.of();
    }

    public static TrainerWrapper empty() {
        return new TrainerWrapper(List.of());
    }
}
