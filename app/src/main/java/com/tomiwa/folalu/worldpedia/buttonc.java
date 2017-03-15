package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonc extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonc);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonCambodia);
        buttonCameroon = (Button) findViewById(R.id.buttonCameroon);
        buttonCanada = (Button) findViewById(R.id.buttonCanada);
        buttonCapeverde = (Button) findViewById(R.id.buttonCapeverde);
        buttonCentralAfrican = (Button) findViewById(R.id.buttonCentralAfrican);
        buttonChad = (Button) findViewById(R.id.buttonChad);
        buttonChile = (Button) findViewById(R.id.buttonChile);
        buttonChina = (Button) findViewById(R.id.buttonChina);
        buttonColombia = (Button) findViewById(R.id.buttonColombia);
        buttonComoros = (Button) findViewById(R.id.buttonComoros);
        buttonCostarica = (Button) findViewById(R.id.buttonCostarica);
        buttonCroatia = (Button) findViewById(R.id.buttonCroatia);
        buttonCuba = (Button) findViewById(R.id.buttonCuba);
        buttonCyprus = (Button) findViewById(R.id.buttonCyprus);
        buttonCzech = (Button) findViewById(R.id.buttonCzech);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, cambodia.class);
                startActivity(intent);

            }

        });
        buttonCameroon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, cameroon.class);
                startActivity(intent);

            }

        });
        buttonCanada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, canada.class);
                startActivity(intent);

            }

        });
        buttonCapeverde.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, capeverde.class);
                startActivity(intent);

            }

        });
        buttonCentralAfrican.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, centralafrican.class);
                startActivity(intent);

            }

        });
        buttonChad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, chad.class);
                startActivity(intent);

            }

        });
        buttonChile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, chile.class);
                startActivity(intent);

            }

        });
        buttonChina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, china.class);
                startActivity(intent);

            }

        });
        buttonColombia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, colombia.class);
                startActivity(intent);

            }

        });
        buttonComoros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, comoros.class);
                startActivity(intent);

            }

        });
        buttonCroatia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, croatia.class);
                startActivity(intent);

            }

        });
        buttonCostarica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, costarica.class);
                startActivity(intent);

            }

        });
        buttonCuba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, cuba.class);
                startActivity(intent);

            }

        });
        buttonCyprus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, cyprus.class);
                startActivity(intent);

            }

        });
        buttonCzech.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, czech.class);
                startActivity(intent);

            }

        });

    }

}
