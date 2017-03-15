package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttons extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
            button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonSenegal);
        buttonCameroon = (Button) findViewById(R.id.buttonSerbia);
        buttonCanada = (Button) findViewById(R.id.buttonSierraleone);
        buttonCapeverde = (Button) findViewById(R.id.buttonSingapore);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonSlovenia);
        buttonChad = (Button) findViewById(R.id.buttonSolomonislands);
        buttonChile = (Button) findViewById(R.id.buttonSouthafrica);
        buttonChina = (Button) findViewById(R.id.buttonSouthkorea);
        buttonColombia = (Button) findViewById(R.id.buttonSpain);
        buttonComoros = (Button) findViewById(R.id.buttonSudan);
        buttonCostarica = (Button) findViewById(R.id.buttonSwaziland);
        buttonCroatia = (Button) findViewById(R.id.buttonSweden);
        buttonCuba = (Button) findViewById(R.id.buttonSwitzerland);
        buttonCyprus = (Button) findViewById(R.id.buttonSyria);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, senegal.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, serbia.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, sierra.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, singapore.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, slovenia.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, solomonislands.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, southafrica.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, southkorea.class);
                startActivity(intent);

            }

        });
        buttonColombia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, spain.class);
                startActivity(intent);

            }

        });
        buttonComoros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, sudan.class);
                startActivity(intent);

            }

        });
        buttonCroatia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, swaziland.class);
                startActivity(intent);

            }

        });
        buttonCostarica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, sweden.class);
                startActivity(intent);

            }

        });
        buttonCuba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, switzerland.class);
                startActivity(intent);

            }

        });
        buttonCyprus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, syria.class);
                startActivity(intent);

            }

        });


    }

}
