package com.mygym.app.models;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonCreator;

@Document(collection = "branches")
public record Branch(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String branchId,
        String name,
        List<String> adminIds,
        Integer pincode,
        String address,
        String city,
        List<Equipment> equipments,
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
