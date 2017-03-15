package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    Button button, button2, buttonc, buttond, buttone, buttonf, buttong, buttonh, buttoni, buttonj, buttonk, buttonl,
    buttonm, buttonn, buttono, buttonp, buttonq, buttonr, buttons, buttont, buttonu, buttonv, buttony, buttonz, buttonquiz, buttonworldfacts, buttonw;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttond = (Button) findViewById(R.id.buttond);
        buttone = (Button) findViewById(R.id.buttone);
        buttonf = (Button) findViewById(R.id.buttonf);
        buttong = (Button) findViewById(R.id.buttong);
        buttonh = (Button) findViewById(R.id.buttonh);
        buttoni = (Button) findViewById(R.id.buttoni);
        buttonj = (Button) findViewById(R.id.buttonj);
        buttonk = (Button) findViewById(R.id.buttonk);
        buttonl = (Button) findViewById(R.id.buttonl);
        buttonm = (Button) findViewById(R.id.buttonm);
        buttonn = (Button) findViewById(R.id.buttonn);
        buttono = (Button) findViewById(R.id.buttono);
        buttonp = (Button) findViewById(R.id.buttonp);
        buttonq = (Button) findViewById(R.id.buttonq);
        buttonr = (Button) findViewById(R.id.buttonr);
        buttons = (Button) findViewById(R.id.buttons);
        buttont = (Button) findViewById(R.id.buttont);
        buttonu = (Button) findViewById(R.id.buttonu);
        buttonv = (Button) findViewById(R.id.buttonv);
        buttonw = (Button) findViewById(R.id.buttonw);
        buttony = (Button) findViewById(R.id.buttony);
        buttonz = (Button) findViewById(R.id.buttonz);
        buttonquiz = (Button) findViewById(R.id.buttonquiz);
        buttonworldfacts = (Button) findViewById(R.id.worldfacts);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,App2Activity.class);
                startActivity(intent);

            }

        });
        buttonquiz.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,quiz.class);
                startActivity(intent);

            }

        });
        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,afghanistan.class);
                startActivity(intent);

            }

        });
        buttonc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonc.class);
                startActivity(intent);

            }

        });
        buttond.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttond.class);
                startActivity(intent);

            }

        });
        buttone.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttone.class);
                startActivity(intent);

            }

        });

        buttonf.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonf.class);
                startActivity(intent);

            }

        });
        buttong.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttong.class);
                startActivity(intent);

            }

        });
        buttonh.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonh.class);
                startActivity(intent);

            }

        });
        buttoni.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttoni.class);
                startActivity(intent);

            }

        });
        buttonj.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonj.class);
                startActivity(intent);

            }

        });
        buttonk.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonk.class);
                startActivity(intent);

            }

        });
        buttonl.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonl.class);
                startActivity(intent);

            }

        });
        buttonm.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonm.class);
                startActivity(intent);

            }

        });
        buttonn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonn.class);
                startActivity(intent);

            }

        });
        buttono.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttono.class);
                startActivity(intent);

            }

        });
        buttonp.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonp.class);
                startActivity(intent);

            }

        });
        buttonq.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonq.class);
                startActivity(intent);

            }

        });
        buttonr.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonr.class);
                startActivity(intent);

            }

        });
        buttons.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttons.class);
                startActivity(intent);

            }

        });
        buttont.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttont.class);
                startActivity(intent);

            }

        });
        buttonu.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonu.class);
                startActivity(intent);

            }

        });
        buttonv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonv.class);
                startActivity(intent);

            }

        });
        buttonw.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonw.class);
                startActivity(intent);

            }

        });
        buttony.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttony.class);
                startActivity(intent);

            }

        });
        buttonz.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,buttonz.class);
                startActivity(intent);

            }

        });
        buttonworldfacts.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,worldfacts.class);
                startActivity(intent);

            }

        });


    }

}
