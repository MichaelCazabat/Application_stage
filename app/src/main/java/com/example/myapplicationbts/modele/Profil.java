package com.example.myapplicationbts.modele;

import android.media.Image;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;


public class Profil {


//propriétés

  // private String Nom;
  // private String Prenom;
  // private Date dateEntrée;
    private String Produit;
    private int nbrProduit;
    private ImageView imgProduit;




    public Profil(/*String Nom, String Prenom, Date dateEntrée,*/ String produit, int nbrProduit, ImageView imgProduit){
        //this.Nom = Nom;
        //this.Prenom = Prenom;
        //this.dateEntrée = dateEntrée;
        this.Produit = produit;
        this.nbrProduit = nbrProduit;
        this.imgProduit = imgProduit;

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

    public ImageView getImgProduit() {
        return imgProduit;
    }

    public void setImgProduit(ImageView imgProduit) {
        this.imgProduit = imgProduit;
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
