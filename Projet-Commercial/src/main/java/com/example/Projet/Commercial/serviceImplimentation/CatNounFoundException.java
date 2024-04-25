package com.example.Projet.Commercial.serviceImplimentation;

public class CatNounFoundException extends RuntimeException{

    public CatNounFoundException( String element, String id){

        super(element + " not found  with id  :" + id);
    }
}
