package com.example.myapplicationbts.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationbts.R;
import com.example.myapplicationbts.controleur.Controle;
import com.example.myapplicationbts.modele.Profil;

public class  MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {            // au lancement de l'application, ce qu'il y a dans les crochets va s'executer.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        this.controle = Controle.getInstance();
    }
        /*Button buttonMoinsObjet1 = findViewById(R.id.buttonMoinsObjet1);
        buttonMoinsObjet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                Toast.makeText(MainActivity.this, "gnhié gnhié", Toast.LENGTH_SHORT).show();

            }
        });
*/

        // propriétés
        private Button buttonMoinsObjet1;            //On declare nos élements de la vue
        private Button buttonPlusObjet1;
        private Button buttonMoinsObjet2;
        private Button buttonMoinsObjet3;

        private EditText NbrObjet1;

        private Controle controle;
        Integer nbrProduit = 50;


        // Initialisation des liens avec les objets graphiques
        private void init(){                        // on affecte les élements de la vue
            buttonPlusObjet1 = (Button)findViewById(R.id.buttonPlusObjet1);// il faut transtyper sons findview dans le type de notre element
            NbrObjet1 = (EditText)findViewById(R.id.NbrObjet1);

            ajoutObjet();
        }

        // Va attendre un click sur les boutons + ou - pour ajouter un objet

        private void ajoutObjet(){
            ((Button) findViewById(R.id.buttonPlusObjet1)).setOnClickListener(new Button.OnClickListener(){        // IMPORTANT POUR LE CLICK
                public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mdr ca fais 3 h que je passe a essayer de reparer cette merde", Toast.LENGTH_SHORT).show();




                // Récuperation de données saisies et try catch qui regarde si il y a une erreur.
                try {
                    nbrProduit = Integer.parseInt(NbrObjet1.getText().toString());
                    nbrProduit=nbrProduit+1;

                }catch(Exception e){};
                afficheNbrProduit("test",nbrProduit);
                }
            });



        }



    /**
     *
     * @param nbrProduit
     */
    private void afficheNbrProduit(String Produit,Integer nbrProduit){
        this.controle.creerProfil(Produit,nbrProduit);
        String produit = this.controle.getProduit();
        nbrProduit = this.controle.getNbrProduit();


        //affichage

        NbrObjet1.setText(nbrProduit.toString());

        }
    private void plusButton1(){
        ajoutObjet();

    }


    }

