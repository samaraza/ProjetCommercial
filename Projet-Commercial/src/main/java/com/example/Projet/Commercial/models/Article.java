package com.example.Projet.Commercial.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Id
    private String id;
    private String reference;
    private String designation;
    private double prix;
    private double TVA;
    private String photo;


    @JsonIgnore
    @DBRef
    private Categorie categorie;

}
