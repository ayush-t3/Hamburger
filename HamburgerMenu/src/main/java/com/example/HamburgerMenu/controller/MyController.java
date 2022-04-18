package com.example.HamburgerMenu.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HamburgerMenu.entity.Root;
import com.example.HamburgerMenu.services.ServiceInterface;
@RestController
public class MyController {
    @Autowired
	private ServiceInterface service;
    @GetMapping("/")
    public Root getData() {
    	return  service.getData();
    }
}
