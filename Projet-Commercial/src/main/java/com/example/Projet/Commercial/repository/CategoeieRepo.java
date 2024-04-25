package com.example.Projet.Commercial.repository;

import com.example.Projet.Commercial.models.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoeieRepo extends MongoRepository<Categorie,String> {
}
