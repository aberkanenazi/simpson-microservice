package com.esipe.tp.simpsonmicroservice.model;


import javax.persistence.*;

@Entity
@Table(name = "personnages")
public class Personnage  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String prenom;
    int age;
    String urlimage;

    public Personnage() {
    }

    public Personnage(String nom, String prenom, int age, String urlimage) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.urlimage = urlimage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlImage(String urlimage) {
        this.urlimage = urlimage;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
