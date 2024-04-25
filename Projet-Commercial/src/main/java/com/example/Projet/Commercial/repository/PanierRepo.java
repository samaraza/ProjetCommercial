package com.example.Projet.Commercial.repository;

import com.example.Projet.Commercial.models.Panier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepo extends MongoRepository<Panier, String> {
}
