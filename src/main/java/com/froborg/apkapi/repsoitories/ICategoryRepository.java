package com.froborg.apkapi.repsoitories;

import com.froborg.apkapi.models.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICategoryRepository extends MongoRepository<Category, String> {

}
