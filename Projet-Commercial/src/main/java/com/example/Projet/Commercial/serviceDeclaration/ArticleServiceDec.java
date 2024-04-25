package com.example.Projet.Commercial.serviceDeclaration;

import com.example.Projet.Commercial.models.Article;
import com.example.Projet.Commercial.requestDTO.ArticleDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArticleServiceDec {
     ResponseEntity<List<Article>> getAll();
     Article getById(String id);
     Article addArticle(ArticleDto articleDto);
     void delete(String id);
     void updateArticle(Article article);

}
