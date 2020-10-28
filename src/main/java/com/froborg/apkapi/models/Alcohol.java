package com.froborg.apkapi.models;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

// @Getter
// @Setter
@ToString

@Document(collection = "alcohols")
public class Alcohol {
    @Id
    public String id;
    public String productId;
    public String productNumber;
    @BsonProperty(value = "systembolaget_link")
    public String systembolagetLink;
    public String packaging;
    public String productName;
    public String brand;
    public String[] categories;
    public String image;
    public Boolean available;
    public Float percentage;
    public Float volume;
    public Float price;
    public Float apk;
}
