package com.tomiwa.folalu.worldpedia;

import android.os.Bundle;
import android.widget.Button;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

public class malawi extends ListActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] malawi  = getResources().getStringArray(R.array.malawi );

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.malawi , R.id.label, malawi ));

    }

}
