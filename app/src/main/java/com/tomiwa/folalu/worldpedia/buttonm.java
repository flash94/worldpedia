package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonm extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
    button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonm);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonMacedonia);
        buttonCameroon = (Button) findViewById(R.id.buttonMadagascar);
        buttonCanada = (Button) findViewById(R.id.buttonMalawi);
        buttonCapeverde = (Button) findViewById(R.id.buttonMalaysia);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonMaldives);
        buttonChad = (Button) findViewById(R.id.buttonMali);
        buttonChile = (Button) findViewById(R.id.buttonMalta);
        buttonChina = (Button) findViewById(R.id.buttonMarshall);
        buttonColombia = (Button) findViewById(R.id.buttonMauritania);
        buttonComoros = (Button) findViewById(R.id.buttonMauritius);
        buttonCostarica = (Button) findViewById(R.id.buttonMexico);
        buttonCroatia = (Button) findViewById(R.id.buttonMicronesia);
        buttonCuba = (Button) findViewById(R.id.buttonMoldova);
        buttonCyprus = (Button) findViewById(R.id.buttonMonaco);
        buttonCzech = (Button) findViewById(R.id.buttonMongolia);
        button2 = (Button) findViewById(R.id.buttonMontenegro);
        button3 = (Button) findViewById(R.id.buttonMontserrat);
        button4 = (Button) findViewById(R.id.buttonMorocco);
        button5 = (Button) findViewById(R.id.buttonMozambique);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, macedonia.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, madagascar.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, malawi.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, malaysia.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, maldives.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mali.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, malta.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, marshallisland.class);
                startActivity(intent);

            }

        });
        buttonColombia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mauritania.class);
                startActivity(intent);

            }

        });
        buttonComoros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mauritius.class);
                startActivity(intent);

            }

        });
        buttonCroatia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mexico.class);
                startActivity(intent);

            }

        });
        buttonCostarica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, micronesia.class);
                startActivity(intent);

            }

        });
        buttonCuba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, moldova.class);
                startActivity(intent);

            }

        });
        buttonCyprus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, monaco.class);
                startActivity(intent);

            }

        });
        buttonCzech.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mongolia.class);
                startActivity(intent);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, montenegro.class);
                startActivity(intent);

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, montserrat.class);
                startActivity(intent);

            }

        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, morocco.class);
                startActivity(intent);

            }

        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mozambique.class);
                startActivity(intent);

            }

        });


    }

}
