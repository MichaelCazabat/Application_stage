package com.example.myapplicationbts.modele;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;


public class Profil {


//propriétés

  // private String Nom;
  // private String Prenom;
  // private Date dateEntrée;
    private String Produit;
    private int nbrProduit;




    public Profil(/*String Nom, String Prenom, Date dateEntrée,*/ String produit, int nbrProduit){
        //this.Nom = Nom;
        //this.Prenom = Prenom;
        //this.dateEntrée = dateEntrée;
        this.Produit = produit;
        this.nbrProduit = nbrProduit;

    }

    public int getNbrProduit() {
        return nbrProduit;
    }

    public  int setNbrProduit(int produit){
        this.nbrProduit=produit;
        return nbrProduit;
    }

    public String getProduit() {
        return Produit;
    }

    /*public String getPrenom() {
        return Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public Date getDateEntrée() {
        return dateEntrée;
    }

*/



}
