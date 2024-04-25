package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
    private String reference;
    private String dateCommande;
}
