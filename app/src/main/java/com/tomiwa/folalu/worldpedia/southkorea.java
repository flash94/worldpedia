package com.tomiwa.folalu.worldpedia;

import android.os.Bundle;
import android.widget.Button;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class southkorea extends ListActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] southkorea = getResources().getStringArray(R.array.southkorea);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.southkorea, R.id.label, southkorea));

    }

}
