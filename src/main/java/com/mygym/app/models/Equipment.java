package com.mygym.app.models;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import org.springframework.data.annotation.PersistenceCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.mygym.app.validation.OnCreate;

public record Equipment(
        @PositiveOrZero Integer equipmentId,
        @NotBlank(groups = OnCreate.class) @Size(max = 100) String name,
        String targetMuscle,
        Boolean isInWorkingCondition,
        Failure failure) implements Serializable {

    @PersistenceCreator
    @JsonCreator
    public Equipment {
        isInWorkingCondition = isInWorkingCondition != null ? isInWorkingCondition : Boolean.TRUE;
    }

    public Equipment withEquipmentId(Integer equipmentId) {
        return new Equipment(equipmentId, name, targetMuscle, isInWorkingCondition, failure);
    }

    public Equipment withCondition(Boolean isInWorkingCondition, Failure failure) {
        return new Equipment(equipmentId, name, targetMuscle, isInWorkingCondition, failure);
    }
}
