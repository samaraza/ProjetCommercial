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
public class FactureFournisseur {
    @Id
    private String id;
    @JsonIgnore
    @DBRef
    private Article article;
    private CommandeFournisseur commandeFournisseur;
}

