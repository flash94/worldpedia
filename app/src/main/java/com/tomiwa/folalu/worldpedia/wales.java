package com.tomiwa.folalu.worldpedia;

import android.os.Bundle;
import android.widget.Button;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class wales extends ListActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] wales = getResources().getStringArray(R.array.wales);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.wales, R.id.label, wales
        ));

    }

}
