package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
    private String nom;
    private String prenom;
    private String email;
    private String datedenaissance;
    private String motdepasse;
    private String adress;
}
