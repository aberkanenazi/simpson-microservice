package com.esipe.tp.simpsonmicroservice.service;

import com.esipe.tp.simpsonmicroservice.model.Personnage;
import com.esipe.tp.simpsonmicroservice.repository.PersonnageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonnageServiceImpl implements ServiceImpl<Personnage> {
    @Autowired
    private PersonnageRepository personnageRepository;


    @Override
    public Personnage create(Personnage personnage) {
        return personnageRepository.save(personnage);
    }

    @Override
    public Optional<Personnage> findById(long id) {
        return personnageRepository.findById(id);
    }

    @Override
    public List<Personnage> findAll() {
        return personnageRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        personnageRepository.deleteById(id);
    }

}
