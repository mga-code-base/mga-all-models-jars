package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mygym.app.validation.OnCreate;

@Document(collection = "trainers")
public record Trainer(
        @JsonIgnore @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        @Indexed(unique = true, sparse = true) String trainerId,
        @NotBlank(groups = OnCreate.class) @Size(max = 100) String name,
        @Indexed(unique = true, sparse = true) @NotBlank(groups = OnCreate.class) @Size(max = 64) String username,
        @NotBlank(groups = OnCreate.class) @Size(min = 8, max = 72, groups = OnCreate.class) String password,
        @Positive Long mobileNumber,
        @Email @Size(max = 254) String emailAddress,
        Boolean isActive,
        @Indexed(sparse = true) String branchId,
        @JsonProperty("activeClients") List<String> activeClientIds) implements Serializable {

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
