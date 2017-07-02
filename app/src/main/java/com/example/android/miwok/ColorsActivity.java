package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "weṭeṭṭi",R.raw.color_red));
        words.add(new Word("Green", "chokokki",R.raw.color_green));
        words.add(new Word("Brown", "ṭakaakki",R.raw.color_brown));
        words.add(new Word("Gray", "ṭopoppi",R.raw.color_gray));
        words.add(new Word("Black", "kululli",R.raw.color_black));
        words.add(new Word("White","kelelli",R.raw.color_white));
        words.add(new Word("Mustard Yellow", "chiwiiṭә",R.raw.color_mustard_yellow));


        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
