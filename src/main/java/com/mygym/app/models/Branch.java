package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.Valid;
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
import com.mygym.app.validation.OnCreate;

@Document(collection = "branches")
public record Branch(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        @Indexed(unique = true, sparse = true) String branchId,
        @NotBlank(groups = OnCreate.class) @Size(max = 100) String name,
        @Indexed(sparse = true) List<String> adminIds,
        @Positive Integer pincode,
        @Size(max = 300) String address,
        @Size(max = 100) String city,
        List<@Valid Equipment> equipments,
        Boolean isActive) implements Serializable {

    @PersistenceCreator
    @JsonCreator
    public Branch {
        isActive = isActive != null ? isActive : Boolean.FALSE;
    }

    public static Branch notFound() {
        return new Branch(null, "-1", null, null, null, null, null, null, null);
    }

    public Branch withBranchId(String branchId) {
        return new Branch(_id, branchId, name, adminIds, pincode, address, city, equipments, isActive);
    }

    public Branch withAdminIds(List<String> adminIds) {
        return new Branch(_id, branchId, name, adminIds, pincode, address, city, equipments, isActive);
    }

    public Branch withEquipments(List<Equipment> equipments) {
        return new Branch(_id, branchId, name, adminIds, pincode, address, city, equipments, isActive);
    }

    public Branch withIsActive(Boolean isActive) {
        return new Branch(_id, branchId, name, adminIds, pincode, address, city, equipments, isActive);
    }

    public Branch withDetailsFrom(Branch source) {
        return new Branch(_id, branchId, source.name(), source.adminIds(), source.pincode(), source.address(),
                source.city(), source.equipments(), source.isActive());
    }
}
