package com.example.Projet.Commercial.serviceImplimentation;

import com.example.Projet.Commercial.models.Article;
import com.example.Projet.Commercial.repository.ArticleRepo;
import com.example.Projet.Commercial.requestDTO.ArticleDto;
import com.example.Projet.Commercial.serviceDeclaration.ArticleServiceDec;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImp implements ArticleServiceDec {
    private  final ArticleRepo articleRepo;
    @Override
    public ResponseEntity<List<Article>> getAll() {
        return new  ResponseEntity<> (articleRepo.findAll(), HttpStatus.OK);
    }

    @Override
    public Article getById(String id) {
        Optional<Article> article = this.articleRepo.findById(id);
        if (article.isEmpty()){
            throw new CatNounFoundException("article", id);
        }
        return article.get();
    }

    @Override
    public Article addArticle(ArticleDto articleDto) {
        Article article = new Article();
        article.setReference(articleDto.getReference());
        article.setDesignation(articleDto.getDesignation());
        /*article.setPrix(articleDto.getPrix());
        article.setTVA(articleDto.getPrixTVA());*/
        article.setPhoto(articleDto.getPhoto());
       return articleRepo.save(article);

    }

    @Override
    public void delete(String id) {
        if (!articleRepo.existsById(id)){
            throw new CatNounFoundException("article", id);
        }
        this.articleRepo.deleteById(id);

    }

    @Override
    public void updateArticle(Article article) {
        Article art = articleRepo.findById(article.getId()).get();
        art.setReference(article.getReference());
        art.setDesignation(article.getDesignation());
        article.setPhoto(article.getPhoto());
        articleRepo.save(art);

    }
}
