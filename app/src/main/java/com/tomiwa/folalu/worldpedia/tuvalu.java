package com.tomiwa.folalu.worldpedia;

import android.os.Bundle;
import android.widget.Button;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class tuvalu extends ListActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] tuvalu = getResources().getStringArray(R.array.tuvalu);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.tuvalu, R.id.label, tuvalu));

    }

}
