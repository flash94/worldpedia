package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttone extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttone);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonEast);
        buttonCameroon = (Button) findViewById(R.id.buttonEcuador);
        buttonCanada = (Button) findViewById(R.id.buttonElsalvador);
        buttonBarbados = (Button) findViewById(R.id.buttonEquatorialguinea);
        buttonBelarus = (Button) findViewById(R.id.buttonEritrea);
        buttonBelgium  = (Button) findViewById(R.id.buttonEstonia);
        buttonBelize = (Button) findViewById(R.id.buttonEthiopia);

        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, easttimor.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ecuador.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, elsalvador.class);
                startActivity(intent);

            }

        });
        buttonBarbados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, equatorial.class);
                startActivity(intent);

            }

        });
        buttonBelarus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, eritrea.class);
                startActivity(intent);

            }

        });

        buttonBelgium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, estonia.class);
                startActivity(intent);

            }

        });
        buttonBelize.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ethiopia.class);
                startActivity(intent);

            }

        });


    }

}
