package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonp extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
            button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonp);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonPakistan);
        buttonCameroon = (Button) findViewById(R.id.buttonPalau);
        buttonCanada = (Button) findViewById(R.id.buttonPalestine);
        buttonCapeverde = (Button) findViewById(R.id.buttonPanama);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonPapua);
        buttonChad = (Button) findViewById(R.id.buttonParaguay);
        buttonChile = (Button) findViewById(R.id.buttonPeru);
        buttonChina = (Button) findViewById(R.id.buttonPhilippines);
        buttonColombia = (Button) findViewById(R.id.buttonPoland);
        buttonComoros = (Button) findViewById(R.id.buttonPortugal);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, pakistan.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, palau.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, palestine.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, panama.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, papua.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, paraguay.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, peru.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, philippines.class);
                startActivity(intent);

            }

        });
        buttonColombia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, poland.class);
                startActivity(intent);

            }

        });
        buttonComoros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, portugal.class);
                startActivity(intent);

            }

        });


    }

}
