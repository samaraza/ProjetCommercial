package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDto {

    private String nom;
    private String designation;


}
