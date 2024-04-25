package com.example.Projet.Commercial.serviceImplimentation;

import com.example.Projet.Commercial.models.Categorie;
import com.example.Projet.Commercial.repository.CategoeieRepo;
import com.example.Projet.Commercial.requestDTO.CategorieDto;
import com.example.Projet.Commercial.serviceDeclaration.CategorieServiceDec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategorieServiceImp implements CategorieServiceDec {
    private final CategoeieRepo categoeieRepo;

    @Override
    public ResponseEntity<List<Categorie>> getlistcategorie() {

        return new ResponseEntity<>(categoeieRepo.findAll(), HttpStatus.OK);
    }

    @Override
    public Categorie getById(String id) {

      Optional<Categorie> categorie = this.categoeieRepo.findById(id);
           if (categorie.isEmpty()){
              throw new CatNounFoundException("categorie", id);
           }
             return categorie.get()  ;
    }

    @Override
    public Categorie addCategorie(CategorieDto categorieDto) {
        Categorie categorie = new Categorie();
        categorie.setNom(categorieDto.getNom());
        categorie.setDesignation(categorieDto.getDesignation());
        return categoeieRepo.save(categorie);

    }
    @Override
    public ResponseEntity<Categorie> updateCategorie(Categorie categorie) {

        Categorie cat = categoeieRepo.findById(categorie.getId()).get();
        cat.setNom(categorie.getNom());
        cat.setDesignation(categorie.getDesignation());
       return new  ResponseEntity<>(categoeieRepo.save(cat), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<String> delete(String id) {

      if (!categoeieRepo.existsById(id)){
         throw new CatNounFoundException("categorie", id);
      }
             this.categoeieRepo.deleteById(id);
      return new ResponseEntity<>("admin" ,HttpStatus.OK);
          }

}
