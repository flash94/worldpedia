package com.tomiwa.folalu.worldpedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;



public class quizpage16 extends Activity

{
    Button button, button2, button3, button4;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.quizpage16);

        final Context context = this;

        button = (Button) findViewById(R.id.option61);
        button2 = (Button) findViewById(R.id.option62);
        button3 = (Button) findViewById(R.id.option63);
        button4 = (Button) findViewById(R.id.option64);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "Correct Answer! Click Next For Next Question", Toast.LENGTH_SHORT).show();
            }
        });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        Toast.makeText(getApplicationContext(),
                                "Ops Incorrect Answer! (Answer is Belgium)", Toast.LENGTH_SHORT).show();
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        Toast.makeText(getApplicationContext(),
                                "Ops Incorrect Answer! (Answer is Belgium)", Toast.LENGTH_SHORT).show();
                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent intent = new Intent(context, quizpage17.class);
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
