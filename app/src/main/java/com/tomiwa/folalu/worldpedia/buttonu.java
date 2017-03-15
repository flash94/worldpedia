package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonu extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
            button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonu);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonUnitedarab);
        buttonCameroon = (Button) findViewById(R.id.buttonUganda);
        buttonCanada = (Button) findViewById(R.id.buttonUkraine);
        buttonCapeverde = (Button) findViewById(R.id.buttonUnitedkingdom);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonUnitedstates);
        buttonChad = (Button) findViewById(R.id.buttonUruguay);
        buttonChile = (Button) findViewById(R.id.buttonUzbekistan);




        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, uae.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, uganda.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ukraine.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, unitedkingdom.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, unitedstates.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, uruguay.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, uzbekistan.class);
                startActivity(intent);

            }

        });


    }

}
