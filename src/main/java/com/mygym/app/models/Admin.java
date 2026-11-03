package com.mygym.app.models;

import java.io.Serial;
import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "admins")
public record Admin(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String adminId,
        String name,
        String username,
        String password,
        String mobileNumber,
        String emailAddress,
        Boolean isActive,
        @JsonProperty("branch") String branchId) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @PersistenceCreator
    @JsonCreator
    public Admin {
        isActive = isActive != null ? isActive : Boolean.FALSE;
    }

    public static Admin notFound() {
        return new Admin(null, "-1", null, null, null, null, null, null, null);
    }

    public static Admin empty() {
        return new Admin(null, null, null, null, null, null, null, null, null);
    }

    public static Admin primary(String username, String password) {
        return new Admin(null, "0", null, username, password, "-1", "-1", null, null);
    }

    public Admin withIds(String adminId, String branchId) {
        return new Admin(_id, adminId, name, username, password, mobileNumber, emailAddress, isActive, branchId);
    }

    public Admin withPassword(String password) {
        return new Admin(_id, adminId, name, username, password, mobileNumber, emailAddress, isActive, branchId);
    }

    public Admin withoutPassword() {
        return withPassword(null);
    }

    public Admin withIsActive(Boolean isActive) {
        return new Admin(_id, adminId, name, username, password, mobileNumber, emailAddress, isActive, branchId);
    }

    public Admin withProfileFrom(Admin source, String password) {
        return new Admin(_id, adminId, source.name(), source.username(), password, source.mobileNumber(),
                source.emailAddress(), source.isActive(), branchId);
    }
}
