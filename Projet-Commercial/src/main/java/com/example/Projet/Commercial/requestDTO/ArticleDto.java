package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ArticleDto {
    private String id;
    private String reference;
    private String designation;
    private String prix;
    private String prixTVA;
    private String photo;
}
