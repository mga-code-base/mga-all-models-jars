package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "trainers")
public record Trainer(
        @JsonIgnore @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String trainerId,
        String name,
        String username,
        String password,
        Long mobileNumber,
        String emailAddress,
        Boolean isActive,
        String branchId,
        @JsonProperty("activeClients") List<String> activeClientIds) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @PersistenceCreator
    @JsonCreator
    public Trainer {
        isActive = isActive != null ? isActive : Boolean.FALSE;
    }

    public static Trainer notFound() {
        return new Trainer(null, "-1", null, null, null, null, null, null, null, null);
    }

    public Trainer withTrainerId(String trainerId) {
        return new Trainer(_id, trainerId, name, username, password, mobileNumber, emailAddress, isActive, branchId, activeClientIds);
    }

    public Trainer withPassword(String password) {
        return new Trainer(_id, trainerId, name, username, password, mobileNumber, emailAddress, isActive, branchId, activeClientIds);
    }

    public Trainer withoutPassword() {
        return withPassword(null);
    }

    public Trainer withIsActive(Boolean isActive) {
        return new Trainer(_id, trainerId, name, username, password, mobileNumber, emailAddress, isActive, branchId, activeClientIds);
    }

    public Trainer withProfileFrom(Trainer source, String password) {
        return new Trainer(_id, trainerId, source.name(), source.username(), password, source.mobileNumber(),
                source.emailAddress(), source.isActive(), branchId, source.activeClientIds());
    }
}
