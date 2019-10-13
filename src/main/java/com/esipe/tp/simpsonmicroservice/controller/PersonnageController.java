package com.esipe.tp.simpsonmicroservice.controller;

import com.esipe.tp.simpsonmicroservice.model.Personnage;
import com.esipe.tp.simpsonmicroservice.service.PersonnageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonnageController {
    @Autowired
    private PersonnageServiceImpl personnageService;
    //public PersonnageController(PersonnageServiceImpl personnageService) {
      //  this.personnageService = personnageService;
    //}

    @GetMapping("/personnages")
    public List<Personnage> getAllPersonnage(){
        System.out.println("ok");
        List<Personnage> personnageList= personnageService.findAll();
        System.out.println(personnageList);
         return personnageList;
    }

}
