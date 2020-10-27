package com.froborg.apkapi;

import java.util.List;

import com.froborg.apkapi.models.Alcohol;
import com.froborg.apkapi.repsoitories.IAlcoholRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AlcoholsController {

    @Autowired
    private IAlcoholRepository alcoholRepository;

    @GetMapping("/alcohols")
    public List<Alcohol> AllAlcohols(@RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "limit", defaultValue = "100") int limit) {

        var alcohols = alcoholRepository.findAll();
        // return alcohols.get(0).
        return alcohols.subList((page - 1) * limit, page * limit);

    }
}
