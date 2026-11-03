package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;

public record TrainerAssigned(String trainerId, String daysOfTheWeek) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
}
