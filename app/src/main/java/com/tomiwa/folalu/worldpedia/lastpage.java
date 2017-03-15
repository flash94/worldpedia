package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class lastpage extends Activity {

    Button button, buttonbahamas, buttonbahrain, buttonBangladesh, buttonBarbados, buttonBelarus, buttonBelgium, buttonBelize, buttonBenin, buttonBermuda, buttonBhutan,
            buttonBolivia, buttonBosnia, buttonBotswana, buttonBrazil, buttonBrunei, buttonBulgaria, buttonBurkinafaso, buttonBurundi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastpage);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonbahamas = (Button) findViewById(R.id.option42);


        buttonbahamas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });

    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
