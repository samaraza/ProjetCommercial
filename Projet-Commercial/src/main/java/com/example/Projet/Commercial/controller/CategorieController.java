package com.example.Projet.Commercial.controller;

import com.example.Projet.Commercial.models.Categorie;
import com.example.Projet.Commercial.requestDTO.CategorieDto;
import com.example.Projet.Commercial.serviceImplimentation.CategorieServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CategorieController {
    private final CategorieServiceImp categorieServiceImp;


    @GetMapping("/listcategorie")

    public ResponseEntity <List<Categorie>> getlistcategorie(){

        return categorieServiceImp.getlistcategorie();
    }

    @GetMapping("/getcategById/{id}")

    public Categorie getById(@PathVariable String id){

        return categorieServiceImp.getById(id);
    }


    @PostMapping("/add")

    public ResponseEntity <Categorie> addCategorie(@RequestBody CategorieDto categorieDto){

        return new ResponseEntity<>(categorieServiceImp.addCategorie(categorieDto), HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")

    public ResponseEntity <String> delete (@PathVariable() String id){

       return   categorieServiceImp.delete(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Categorie> updateCategorie(@PathVariable String id, @RequestBody Categorie cat){

       return categorieServiceImp.updateCategorie(cat);
    }



}
