package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonk extends Activity {

    Button button, buttonbahamas, buttonbahrain, buttonBangladesh, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonk);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonbahamas = (Button) findViewById(R.id.buttonKazakhstan);
        buttonbahrain = (Button) findViewById(R.id.buttonKenya);
        buttonBangladesh = (Button) findViewById(R.id.buttonKiribati);
        buttonBarbados = (Button) findViewById(R.id.buttonKuwait);
        buttonBelarus = (Button) findViewById(R.id.buttonKyrgyzstan);

        buttonbahamas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, kazakhstan.class);
                startActivity(intent);

            }

        });
        buttonbahrain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, kenya.class);
                startActivity(intent);

            }

        });
        buttonBangladesh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, kiribati.class);
                startActivity(intent);

            }

        });
        buttonBarbados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, kuwait.class);
                startActivity(intent);

            }

        });
        buttonBelarus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, kyrgyzstan.class);
                startActivity(intent);

            }

        });

            }




}
