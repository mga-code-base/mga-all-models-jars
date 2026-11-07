package com.mygym.app.models;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "grievances")
public record Grievance(
        @Id @MongoId(targetType = FieldType.OBJECT_ID) ObjectId _id,
        String grievanceId,
        String branchId,
        String memberId,
        String title,
        String date,
        String issueType,
        String description,
        String resolution,
        String closureDate) implements Serializable {

    public static Grievance notFound() {
        return new Grievance(null, "-1", null, null, null, null, null, null, null, null);
    }

    public Grievance withGrievanceId(String grievanceId) {
        return new Grievance(_id, grievanceId, branchId, memberId, title, date, issueType, description, resolution, closureDate);
    }

    public Grievance withResolution(String resolution, String closureDate) {
        return new Grievance(_id, grievanceId, branchId, memberId, title, date, issueType, description, resolution, closureDate);
    }

    public Grievance withDetailsFrom(Grievance source) {
        return new Grievance(_id, grievanceId, source.branchId(), source.memberId(), source.title(), source.date(),
                source.issueType(), source.description(), source.resolution(), source.closureDate());
    }
}
