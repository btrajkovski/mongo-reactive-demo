package com.north47.mongoreactivedemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kayak {
    @Id
    private String id;
    private String name;
    private String owner;
    private Number value;
    private String makeModel;

    public Kayak(String name, String owner, Number value, String makeModel) {
        this.name = name;
        this.owner = owner;
        this.value = value;
        this.makeModel = makeModel;
    }
}