package com.mygym.app.models;

import java.io.Serializable;

import org.springframework.data.annotation.PersistenceCreator;

import com.fasterxml.jackson.annotation.JsonCreator;

public record Equipment(
        Integer equipmentId,
        String name,
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
