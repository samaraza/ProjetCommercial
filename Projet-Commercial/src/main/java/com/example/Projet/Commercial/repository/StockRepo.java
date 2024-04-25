package com.example.Projet.Commercial.repository;

import com.example.Projet.Commercial.models.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends MongoRepository<Stock, String> {
}
