package com.mygym.app.models;

import java.io.Serializable;

public record TrainerAssigned(String trainerId, String daysOfTheWeek) implements Serializable {
}
