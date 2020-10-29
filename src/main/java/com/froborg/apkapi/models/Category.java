package com.froborg.apkapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString

@Document(collection = "categories")
public class Category {
    @Id
    public String id;
    public String name;
    public String items;
}
