package com.froborg.apkapi;

import java.util.List;

import com.froborg.apkapi.models.Category;
import com.froborg.apkapi.repsoitories.ICategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategoriesController {

    @Autowired
    private ICategoryRepository _repo;

    @GetMapping
    public List<Category> AllCategories() {
        return _repo.findAll();
    }
}
