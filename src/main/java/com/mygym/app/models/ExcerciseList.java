package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "_exercise")
public record ExcerciseList(
        @JsonIgnore @Id @MongoId(targetType = FieldType.OBJECT_ID) String internalOid,
        @JsonIgnore @Field("id") String customId,
        @JsonProperty("Chest") @Field("Chest") List<String> chestExercises,
        @JsonProperty("Shoulder") @Field("Shoulder") List<String> shoulderExercises,
        @JsonProperty("Back") @Field("Back") List<String> backExercises,
        @JsonProperty("Biceps") @Field("Biceps") List<String> bicepsExercises,
        @JsonProperty("Triceps") @Field("Triceps") List<String> tricepsExercises,
        @JsonProperty("Legs") @Field("Legs") List<String> legsExercises,
        @JsonProperty("Abs") @Field("Abs") List<String> absExercises,
        @JsonProperty("Cardio") @Field("Cardio") List<String> cardioExercises) implements Serializable {
}
