package com.froborg.apkapi.repsoitories;

import com.froborg.apkapi.models.Alcohol;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAlcoholRepository extends MongoRepository<Alcohol, String> {

}
