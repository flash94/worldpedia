package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonj extends Activity {

    Button button, buttonbahamas, buttonbahrain, buttonBangladesh, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonj);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonbahamas = (Button) findViewById(R.id.buttonJamaica);
        buttonbahrain = (Button) findViewById(R.id.buttonJapan);
        buttonBangladesh = (Button) findViewById(R.id.buttonJordan);

        buttonbahamas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, jamaica.class);
                startActivity(intent);

            }

        });
        buttonbahrain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, japan.class);
                startActivity(intent);

            }

        });
        buttonBangladesh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, jordan.class);
                startActivity(intent);

            }

        });

    }

}
