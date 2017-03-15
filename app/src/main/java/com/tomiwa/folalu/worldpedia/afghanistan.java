package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class afghanistan extends Activity {

    Button button, buttonbahamas, buttonbahrain, buttonBangladesh, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afghanistan);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonbahamas = (Button) findViewById(R.id.buttonbahamas);
        buttonbahrain = (Button) findViewById(R.id.buttonbahrain);
        buttonBangladesh = (Button) findViewById(R.id.buttonBangladesh);
        buttonBarbados = (Button) findViewById(R.id.buttonBarbados);
        buttonBelarus = (Button) findViewById(R.id.buttonBelarus);
        buttonBelgium = (Button) findViewById(R.id.buttonBelgium);
        buttonBelize = (Button) findViewById(R.id.buttonBelize);
        buttonBenin = (Button) findViewById(R.id.buttonBenin);
        buttonBhutan = (Button) findViewById(R.id.buttonBhutan);
        buttonBolivia = (Button) findViewById(R.id.buttonBolivia);
        buttonBosnia = (Button) findViewById(R.id.buttonBosnia);
        buttonBotswana = (Button) findViewById(R.id.buttonBotswana);
        buttonBrazil = (Button) findViewById(R.id.buttonBrazil);
        buttonBrunei = (Button) findViewById(R.id.buttonBrunei);
        buttonBulgaria = (Button) findViewById(R.id.buttonBulgaria);
        buttonBurkinafaso = (Button) findViewById(R.id.buttonBurkinafaso);


        buttonBurundi = (Button) findViewById(R.id.buttonBurundi);

        buttonbahamas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bahamas.class);
                startActivity(intent);

            }

        });
        buttonbahrain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bahrain.class);
                startActivity(intent);

            }

        });
        buttonBangladesh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bangladesh.class);
                startActivity(intent);

            }

        });
        buttonBarbados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, barbados.class);
                startActivity(intent);

            }

        });
        buttonBelarus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, belarus.class);
                startActivity(intent);

            }

        });
        buttonBelgium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, belgium.class);
                startActivity(intent);

            }

        });
        buttonBelize.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, belize.class);
                startActivity(intent);

            }

        });
        buttonBenin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, benin.class);
                startActivity(intent);

            }

        });
        buttonBolivia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bolivia.class);
                startActivity(intent);

            }

        });
        buttonBosnia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bosnia.class);
                startActivity(intent);

            }

        });
        buttonBotswana.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, botswana.class);
                startActivity(intent);

            }

        });
        buttonBrazil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, brazil.class);
                startActivity(intent);

            }

        });
        buttonBrunei.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, brunei.class);
                startActivity(intent);

            }

        });
        buttonBenin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, benin.class);
                startActivity(intent);

            }

        });
        buttonBulgaria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bulgaria.class);
                startActivity(intent);

            }

        });
        buttonBurkinafaso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, burkinafaso.class);
                startActivity(intent);

            }

        });

        buttonBurundi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, burundi.class);
                startActivity(intent);

            }

        });

        buttonBhutan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, bhutan.class);
                startActivity(intent);

            }

        });
    }

}
