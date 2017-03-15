package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttont extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
            button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttont);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonTaiwan);
        buttonCameroon = (Button) findViewById(R.id.buttonTajikistan);
        buttonCanada = (Button) findViewById(R.id.buttonTanzania);
        buttonCapeverde = (Button) findViewById(R.id.buttonThailand);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonTogo);
        buttonChad = (Button) findViewById(R.id.buttonTrinidad);
        buttonChile = (Button) findViewById(R.id.buttonTunisia);
        buttonChina = (Button) findViewById(R.id.buttonTurkey);
        buttonColombia = (Button) findViewById(R.id.buttonTurkmenistan);
        buttonComoros = (Button) findViewById(R.id.buttonTuvalu);




        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, taiwan.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, tajikistan.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, tanzania.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, thailand.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, togo.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, trinidad.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, tunisia.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, turkey.class);
                startActivity(intent);

            }

        });
        buttonColombia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, turkmenistan.class);
                startActivity(intent);

            }

        });
        buttonComoros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, tuvalu.class);
                startActivity(intent);

            }

        });


    }

}
