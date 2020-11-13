package com.example.myapplicationbts.controleur;

import android.media.Image;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplicationbts.modele.Profil;
import com.example.myapplicationbts.vue.MainActivity;

public final class Controle {

    private static Controle instance = null;
    private Profil profil;

    private Controle(){
        super();
    }


    public static final Controle getInstance(){ //singleton
        if(instance == null ){
            Controle.instance = new Controle();

        }              //
        return Controle.instance;               //
    } //singleton


    public void creerProfil(String produit, int nbrProduit, ImageView imgProduit){
        profil = new Profil(produit,nbrProduit, imgProduit);
    }

    public int getNbrProduit(){
        return profil.getNbrProduit();
    }
    public String getProduit(){
        return profil.getProduit();
    }







}
