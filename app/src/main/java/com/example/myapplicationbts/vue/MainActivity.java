package com.example.myapplicationbts.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
      /*  private Button buttonMoinsObjet1;            //On declare nos élements de la vue
        private Button buttonPlusObjet1;
        private Button buttonMoinsObjet2;
        private Button buttonPlusObjet2;
        private Button buttonMoinsObjet3;

       */

        private EditText NbrObjet1;
        private TextView txtObjet;
        private TextView txtObjet1;
        private String nomProduit1="";
        private ImageView imgProduit1;
        private ImageView imgProduit2;
        private ImageView imgProduit3;
        private ImageView imgProduit4;
        private ImageView imgProduit5;

        private Controle controle;
        Integer nbrProduit = 69;



        // Initialisation des liens avec les objets graphiques
        private void init(){
          // afficheNbrProduit("test",50, NbrObjet1);
            // on affecte les élements de la vue
            // buttonPlusObjet1 = (Button)findViewById(R.id.buttonPlusObjet1);// il faut transtyper sons findview dans le type de notre element

            NbrObjet1 = (EditText)findViewById(R.id.NbrObjet1);
            txtObjet1 = (TextView)findViewById(R.id.txtObjet1) ;
            ajoutObjet((EditText)findViewById(R.id.NbrObjet1), (Button) findViewById(R.id.buttonPlusObjet1));//on intialise la methode ajoutObjet et suprObjet avec sa zone de texte et son boutton + et - .
            suprObjet((EditText)findViewById(R.id.NbrObjet1), (Button) findViewById(R.id.buttonMoinsObjet1));
            ((EditText) findViewById(R.id.NbrObjet1)).setText(nbrProduit.toString());
            imgProduit1 = (ImageView) findViewById(R.id.imgProduit1);
            imgProduit1.setImageResource(R.drawable.des_grosses_patates);
           // afficheNbrProduit("test",nbrProduit,(EditText)findViewById(R.id.NbrObjet1));

            ajoutObjet((EditText)findViewById(R.id.NbrObjet2), (Button) findViewById(R.id.buttonPlusObjet2));//on intialise la methode ajoutObjet et suprObjet avec sa zone de texte et son boutton + et - .
            suprObjet((EditText)findViewById(R.id.NbrObjet2), (Button) findViewById(R.id.buttonMoinsObjet2));
            ((EditText) findViewById(R.id.NbrObjet2)).setText(nbrProduit.toString());
            imgProduit2 = (ImageView)findViewById(R.id.imgProduit2);
            imgProduit2.setImageResource(R.drawable.poutre_de_bamako);

            ajoutObjet((EditText)findViewById(R.id.NbrObjet3), (Button) findViewById(R.id.buttonPlusObjet3));//on intialise la methode ajoutObjet et suprObjet avec sa zone de texte et son boutton + et - .
            suprObjet((EditText)findViewById(R.id.NbrObjet3), (Button) findViewById(R.id.buttonMoinsObjet3));
            ((EditText) findViewById(R.id.NbrObjet3)).setText(nbrProduit.toString());
            imgProduit3 = (ImageView)findViewById(R.id.imgProduit3);
            imgProduit3.setImageResource(R.drawable.oeuf_mayo);

            ajoutObjet((EditText)findViewById(R.id.NbrObjet4), (Button) findViewById(R.id.buttonPlusObjet4));//on intialise la methode ajoutObjet et suprObjet avec sa zone de texte et son boutton + et - .
            suprObjet((EditText)findViewById(R.id.NbrObjet4), (Button) findViewById(R.id.buttonMoinsObjet4));
            ((EditText) findViewById(R.id.NbrObjet4)).setText(nbrProduit.toString());
            imgProduit4 = (ImageView)findViewById(R.id.imgProduit4);
            imgProduit4.setImageResource(R.drawable.glaoui_de_chevreuil);

            ajoutObjet((EditText)findViewById(R.id.NbrObjet5), (Button) findViewById(R.id.buttonPlusObjet5));//on intialise la methode ajoutObjet et suprObjet avec sa zone de texte et son boutton + et - .
            suprObjet((EditText)findViewById(R.id.NbrObjet5), (Button) findViewById(R.id.buttonMoinsObjet5));
            ((EditText) findViewById(R.id.NbrObjet5)).setText(nbrProduit.toString());
            imgProduit5 = (ImageView)findViewById(R.id.imgProduit5);
            imgProduit5.setImageResource(R.drawable.ratatouille);


            txtObjet1.setText("Des patates");
            ((TextView)findViewById(R.id.txtObjet2)).setText("Poutres");   // UTILISER POUR AVOIR SES ELEMENTS !!!!!!!
            ((TextView)findViewById(R.id.txtObjet3)).setText("Oeufs-Mayo");
            ((TextView)findViewById(R.id.txtObjet4)).setText("chevreuil");
            ((TextView)findViewById(R.id.txtObjet5)).setText("Ratatouille");
        }

        // Va attendre un click sur les boutons + ou - pour ajouter un objet


        private void ajoutObjet(final EditText NbrObj, Button idbutton ){
            idbutton.setOnClickListener(new Button.OnClickListener(){        // IMPORTANT POUR LE CLICK
                public void onClick(View v) {
              //  Toast.makeText(MainActivity.this, "mdr ca fais 3 h que je passe a essayer de reparer cette merde", Toast.LENGTH_SHORT).show();

                // Récuperation de données saisies et try catch qui regarde si il y a une erreur.
                try {

                    nbrProduit = Integer.parseInt(NbrObj.getText().toString());
                    nbrProduit=nbrProduit+1;

                    NbrObj.setText(nbrProduit.toString());

                }catch(Exception e){};
                afficheNbrProduit("test",nbrProduit,NbrObj);
                }
            });
        }
    private void suprObjet(final EditText NbrObj, Button idbutton ){

        idbutton.setOnClickListener(new Button.OnClickListener(){        // IMPORTANT POUR LE CLICK
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "mdr ca fais 3 h que je passe a essayer de reparer cette merde", Toast.LENGTH_SHORT).show();

                // Récuperation de données saisies et try catch qui regarde si il y a une erreur.
                try {
                    nbrProduit = Integer.parseInt(NbrObj.getText().toString());
                    nbrProduit=nbrProduit-1;

                }catch(Exception e){};
                afficheNbrProduit("du texte ici",nbrProduit,NbrObj);
            }
        });
    }



    /**
     *
     * @param nbrProduit
     */
    private void afficheNbrProduit(String Produit,Integer nbrProduit, EditText NbrObj){

        try {
            this.controle.creerProfil(Produit, nbrProduit,imgProduit1);
            String produit = this.controle.getProduit();
            nbrProduit = this.controle.getNbrProduit();

            //affichage

            NbrObj.setText(nbrProduit.toString());
            //txtObjet1.setText(produit);
        }

        catch (Exception e){Toast.makeText(MainActivity.this, "erreur fonction afficheNbrProduit", Toast.LENGTH_SHORT).show();
            Log.d("du texte on s'en fous" ,"ALED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!: ");
        }

        }

    private void plusButton1(){
        Button idButton = (Button) findViewById(R.id.buttonPlusObjet1);
        ajoutObjet(NbrObjet1,idButton);
    }


    }

