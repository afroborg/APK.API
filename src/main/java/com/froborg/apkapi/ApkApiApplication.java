package com.froborg.apkapi;

import com.froborg.apkapi.repsoitories.IAlcoholRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApkApiApplication {

	@Autowired
	private IAlcoholRepository alcoholRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApkApiApplication.class, args);
	}

}
