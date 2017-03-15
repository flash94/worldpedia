package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class App2Activity extends Activity {

    Button afghanistan, buttonAlbania, buttonAlgeria, buttonAndorra, buttonAngola, buttonAntiguaandBarbuda, buttonArgentina, buttonAustralia,
            buttonAustria, buttonAzerbaijan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagea);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        afghanistan = (Button) findViewById(R.id.buttonAfghanistan);
        buttonAlbania = (Button) findViewById(R.id.buttonAlbania);
        buttonAlgeria = (Button) findViewById(R.id.buttonAlgeria);
        buttonAndorra = (Button) findViewById(R.id.buttonAndorra);
        buttonAngola = (Button) findViewById(R.id.buttonAngola);
        buttonAntiguaandBarbuda = (Button) findViewById(R.id. buttonAntiguaandBarbuda);
        buttonArgentina = (Button) findViewById(R.id.buttonArgentina);
        buttonAustralia = (Button) findViewById(R.id.buttonAustralia);
        buttonAustria = (Button) findViewById(R.id. buttonAustria);
        buttonAzerbaijan = (Button) findViewById(R.id.buttonAzerbaijan);



        afghanistan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Afghan.class);
                startActivity(intent);

            }

        });
        buttonAlbania.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, albania.class);
                startActivity(intent);

            }

        });
        buttonAlgeria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, algeria.class);
                startActivity(intent);

            }

        });
        buttonAndorra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, andorra.class);
                startActivity(intent);

            }

        });
        buttonAngola.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, angola.class);
                startActivity(intent);

            }

        });
        buttonAntiguaandBarbuda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, antigua.class);
                startActivity(intent);

            }

        });
        buttonArgentina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, argentina.class);
                startActivity(intent);

            }

        });
        buttonAustralia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, australia.class);
                startActivity(intent);

            }

        });
        buttonAustria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, austria.class);
                startActivity(intent);

            }

        });
        buttonAzerbaijan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, azerbaijan.class);
                startActivity(intent);

            }

        });
    }

}
