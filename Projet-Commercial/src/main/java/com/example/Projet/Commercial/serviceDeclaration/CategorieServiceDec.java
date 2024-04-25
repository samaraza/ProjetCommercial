package com.example.Projet.Commercial.serviceDeclaration;

import com.example.Projet.Commercial.models.Categorie;
import com.example.Projet.Commercial.requestDTO.CategorieDto;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface CategorieServiceDec {

    ResponseEntity<List<Categorie>> getlistcategorie();
    Categorie getById(String id);
    Categorie addCategorie(CategorieDto categorieDto);
    ResponseEntity<Categorie> updateCategorie(Categorie categorie);
    ResponseEntity<String> delete (String id);







}
