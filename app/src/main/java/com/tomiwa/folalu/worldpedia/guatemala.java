package com.tomiwa.folalu.worldpedia;

import android.os.Bundle;
import android.widget.Button;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class guatemala extends ListActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] guatemala = getResources().getStringArray(R.array.guatemala);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.guatemala, R.id.label, guatemala));

    }

}
