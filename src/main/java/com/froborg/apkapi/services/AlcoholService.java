package com.froborg.apkapi.services;

import java.util.List;

import com.froborg.apkapi.models.Alcohol;
import com.froborg.apkapi.repsoitories.IAlcoholRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AlcoholService {
    @Autowired
    IAlcoholRepository alcoholRepository;

    public List<Alcohol> getAll() {
        return alcoholRepository.findAll();
    }

    public Page<Alcohol> getPaged(int page, int limit) {
        var pageable = PageRequest.of(page, limit);
        return alcoholRepository.findAll(pageable);
    }

    public Page<Alcohol> getByCategories(int page, int limit, String[] categories) {
        var pageable = PageRequest.of(page, limit);
        return alcoholRepository.containsCategories(categories, pageable);
    }
}
