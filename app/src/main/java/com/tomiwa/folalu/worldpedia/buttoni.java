package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttoni extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttoni);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonIceland);
        buttonCameroon = (Button) findViewById(R.id.buttonIndia);
        buttonCanada = (Button) findViewById(R.id.buttonIndonesia);
        buttonBarbados = (Button) findViewById(R.id.buttonIran);
        buttonBelarus = (Button) findViewById(R.id.buttonIraq);
        buttonBelgium = (Button) findViewById(R.id.buttonIreland);
        buttonBelize = (Button) findViewById(R.id.buttonIsreal);
        buttonBenin = (Button) findViewById(R.id.buttonItaly);
        buttonBhutan = (Button) findViewById(R.id.buttonIvorycoast);


        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, iceland.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, india.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, indonesia.class);
                startActivity(intent);

            }

        });
        buttonBarbados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, iran.class);
                startActivity(intent);

            }

        });
        buttonBelarus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, iraq.class);
                startActivity(intent);

            }

        });
        buttonBelgium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ireland.class);
                startActivity(intent);

            }

        });
        buttonBelize.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, isreal.class);
                startActivity(intent);

            }

        });
        buttonBenin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, italy.class);
                startActivity(intent);

            }

        });

        buttonBhutan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ivorycoast.class);
                startActivity(intent);

            }

        });


    }

}
