package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDto {
    private String nom;
    private String prenom;
    private String adress;
    private String mail;
    private String numTel;
}
