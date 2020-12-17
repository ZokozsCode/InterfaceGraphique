package com.company;

public class Book {
    private String Titre;
    private String auteur;
    private String Resumer;
    private int Colonne;
    private int Rangée;
    private int Parution;

    public Book(String titre, String auteur, String resumer, int colonne, int rangée, int parution) {
        Titre = titre;
        this.auteur = auteur;
        Resumer = resumer;
        Colonne = colonne;
        Rangée = rangée;
        Parution = parution;
    }


    public String getTitre() {
        return Titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getResumer() {
        return Resumer;
    }

    public int getColonne() {
        return Colonne;
    }

    public int getRangée() {
        return Rangée;
    }

    public int getParution() {
        return Parution;
    }
}
