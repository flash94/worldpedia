package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonl extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonl);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonLaos);
        buttonCameroon = (Button) findViewById(R.id.buttonLatvia);
        buttonCanada = (Button) findViewById(R.id.buttonLebanon);
        buttonCapeverde = (Button) findViewById(R.id.buttonLiberia);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonLibya);
        buttonChad = (Button) findViewById(R.id.buttonLiechtenstein);
        buttonChile = (Button) findViewById(R.id.buttonLithuania);
        buttonChina = (Button) findViewById(R.id.buttonLuxembourg);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, laos.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, latvia.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, lebanon.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, liberia.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, libya.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, liechtenstein.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, lithuania.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, luxembourg.class);
                startActivity(intent);

            }

        });


    }

}
