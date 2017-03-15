package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class buttonw extends Activity {

    Button button, buttonCambodia, buttonCameroon, buttonCanada, buttonCapeverde, buttonCentralAfrican, buttonChad, buttonChile, buttonBenin, buttonBermuda, buttonBhutan,
            buttonChina, buttonColombia, buttonComoros, buttonCostarica, buttonCroatia, buttonCzech, buttonCuba, buttonCyprus, button2, button3,
            button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonw);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        buttonCambodia= (Button) findViewById(R.id.buttonWales);





        buttonCambodia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, wales.class);
                startActivity(intent);

            }

        });


    }

}
