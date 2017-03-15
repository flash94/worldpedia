package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttong extends Activity {

    Button button, buttonbahamas, buttonbahrain, buttonBangladesh, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttong);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonbahamas = (Button) findViewById(R.id.buttonGabon);
        buttonbahrain = (Button) findViewById(R.id.buttonGambia);
        buttonBangladesh = (Button) findViewById(R.id.buttonGeorgia);
        buttonBarbados = (Button) findViewById(R.id.buttonGermany);
        buttonBelarus = (Button) findViewById(R.id.buttonGhana);
        buttonBelgium = (Button) findViewById(R.id.buttonGreece);
        buttonBelize = (Button) findViewById(R.id.buttonGrenada);
        buttonBenin = (Button) findViewById(R.id.buttonGuatemala);
        buttonBhutan = (Button) findViewById(R.id.buttonGuinea);
        buttonBolivia = (Button) findViewById(R.id.buttonGuineaBissau);
        buttonBosnia = (Button) findViewById(R.id.buttonGuyana);

        buttonbahamas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, garbon.class);
                startActivity(intent);

            }

        });
        buttonbahrain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, gambia.class);
                startActivity(intent);

            }

        });
        buttonBangladesh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, georgia.class);
                startActivity(intent);

            }

        });
        buttonBarbados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, germany.class);
                startActivity(intent);

            }

        });
        buttonBelarus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ghana.class);
                startActivity(intent);

            }

        });
        buttonBelgium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, greece.class);
                startActivity(intent);

            }

        });
        buttonBelize.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, grenada.class);
                startActivity(intent);

            }

        });
        buttonBenin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, guatemala.class);
                startActivity(intent);

            }

        });
        buttonBhutan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, guinea.class);
                startActivity(intent);

            }

        });
        buttonBolivia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, guineabissau.class);
                startActivity(intent);

            }

        });
        buttonBosnia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, guyana.class);
                startActivity(intent);

            }

        });

    }

}
