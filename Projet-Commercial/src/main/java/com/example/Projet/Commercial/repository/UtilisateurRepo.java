package com.example.Projet.Commercial.repository;

import com.example.Projet.Commercial.models.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepo extends MongoRepository<Utilisateur, String> {
}
