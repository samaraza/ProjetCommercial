package com.example.Projet.Commercial.controller;

import com.example.Projet.Commercial.models.Article;
import com.example.Projet.Commercial.requestDTO.ArticleDto;
import com.example.Projet.Commercial.serviceImplimentation.ArticleServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ArticleController {
    private final ArticleServiceImp articleServiceImp;

@GetMapping("/listearticle")
    public ResponseEntity<List<Article>> getAll(){
    return this.articleServiceImp.getAll();
}
@GetMapping("/getArticleById{}")
    public Article getById(@PathVariable  String id){
    return articleServiceImp.getById(id);
}

@PostMapping("/addArticle")
    public ResponseEntity <Article> addArticle(@RequestBody ArticleDto articleDto){
    return new  ResponseEntity(articleServiceImp.addArticle(articleDto), HttpStatus.OK);
}
 @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable String id){

    articleServiceImp.delete(id);

 }
 @PutMapping("/update/{id}")
    public void updateArticle(@PathVariable String id, Article art){
    articleServiceImp.updateArticle(art);
 }


}
