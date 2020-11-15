package com.froborg.apkapi.repsoitories;

import com.froborg.apkapi.models.Alcohol;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IAlcoholRepository extends MongoRepository<Alcohol, String> {
    @Query(value = "{ 'categories' : {$in : [?0] }}")
    public Page<Alcohol> containsCategories(String[] categories, Pageable pageable);
}
