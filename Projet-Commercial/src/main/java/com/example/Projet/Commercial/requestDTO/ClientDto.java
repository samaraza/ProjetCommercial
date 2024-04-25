package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
    private String nom;
    private String prenom;
    private String adress;
    private String mail;
    private String numTel;
}
