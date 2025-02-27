package com.example.listviewsandarrays;

import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = (ListView) findViewById(R.id.ListView);
        ArrayList <String> array = new ArrayList<String>();
        array.add("Pencil");
        array.add("Milk");
        array.add("Vegetables");
        array.add("Books");
        ArrayAdapter<String> myAddapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,myList);
        myList.setAdapter(myAddapter);



    }
}