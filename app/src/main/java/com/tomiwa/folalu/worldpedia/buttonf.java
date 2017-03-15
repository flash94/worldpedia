package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonf extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonf);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonFiji);
        buttonCameroon = (Button) findViewById(R.id.buttonFinland);
        buttonCanada = (Button) findViewById(R.id.buttonFrance);


        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, fiji.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, finland.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, france.class);
                startActivity(intent);

            }

        });


    }

}
