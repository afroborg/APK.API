package com.froborg.apkapi;

import java.util.HashMap;

import com.froborg.apkapi.services.AlcoholService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AlcoholsController {

    @Autowired
    private AlcoholService _service;

    @GetMapping("/alcohols")
    public HashMap<String, Object> AllAlcohols(@RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "limit", defaultValue = "100") int limit,
            @RequestParam(name = "categories", defaultValue = "") String[] categories) {

        var alcohols = categories.length > 0 ? _service.getByCategories(page, limit, categories)
                : _service.getPaged(page, limit);

        var map = new HashMap<String, Object>();
        
        var paginationData = new HashMap<String, Integer>();

        paginationData.put("totalRecords", (int)alcohols.getTotalElements());
        paginationData.put("currentPage", alcohols.getNumber());
        paginationData.put("totalPages", alcohols.getTotalPages());

        map.put("meta", paginationData);
        map.put("data", alcohols.getContent());
        return map;

    }
}
