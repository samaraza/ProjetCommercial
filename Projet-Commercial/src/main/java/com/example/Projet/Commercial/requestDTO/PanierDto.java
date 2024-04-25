package com.example.Projet.Commercial.requestDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PanierDto {
    private String reference;
    private String quantiter;
}
