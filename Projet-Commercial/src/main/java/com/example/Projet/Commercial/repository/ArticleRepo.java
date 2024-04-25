package com.example.Projet.Commercial.repository;

import com.example.Projet.Commercial.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends MongoRepository <Article,String >{
}
