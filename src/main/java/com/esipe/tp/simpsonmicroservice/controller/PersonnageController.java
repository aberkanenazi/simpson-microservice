package com.esipe.tp.simpsonmicroservice.controller;

import com.esipe.tp.simpsonmicroservice.model.Personnage;
import com.esipe.tp.simpsonmicroservice.service.PersonnageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnages")
public class PersonnageController {

    private PersonnageServiceImpl personnageService;
    @Autowired
    public PersonnageController(PersonnageServiceImpl personnageService) {
        this.personnageService = personnageService;
    }

    /**
     * Cette fonction nous permet de recuperer tout les personnages
     * @return
     */
    @GetMapping
    public List<Personnage> getAllPersonnage(){
        List<Personnage> personnageList= personnageService.findAll();
        System.out.println(personnageList);
         return personnageList;
    }

    /**
     * Cette fonction permet de recuperer un personnage
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public Personnage getOnePersonnage(@PathVariable Long id){
        return personnageService.findById(id).get();
    }

    /**
     * Cette fonction permet de creer un personnages
     * @param personnage
     * @return
     */
    @PostMapping
    public Personnage createPersonnage(@RequestBody Personnage personnage){
        return personnageService.save(personnage);
    }

    /**
     * Cette fonction permet de mettre a jour un personnage
     * @param personnage
     * @return
     */
    @PutMapping
    public Personnage updatePersonnage(@RequestBody Personnage personnage){
        return personnageService.save(personnage);
    }

    /**
     * Cette fonction permet de supprimer un personnage avec son identifiant
     * @param id
     */
    @DeleteMapping("/{id}")
    void deletePersonnage(@PathVariable Long id) {
        personnageService.deleteById(id);

    }


}
