package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songsList = new ArrayList<>(Arrays.asList(
                new Song("Silence", "Marshmello, Khalid"),
                new Song("Only one", "Carlie Hanson"),
                new Song("Sick Boy", "The Chainsmokers"),
                new Song("Heaven", "Julia Michaels"),
                new Song("Real Friends", "Camila Cabello"),
                new Song("Breathe", "Mako"),
                new Song("Strongest", "Ina Wroldsen"),
                new Song("It's Gotta Be You", "Isaiah"),
                new Song("Let You Go", "Nightcall"),
                new Song("Lie", "Shallou, Riah")
        ));

        ListView songsListView = findViewById(R.id.list);

        songsListView.setAdapter(new SongAdapter<Song>(this, songsList));

        songsListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);
                songIntent.putExtra("title", songsList.get(i).getmTitle());
                songIntent.putExtra("artist", songsList.get(i).getmArtist());
                startActivity(songIntent);
            }
        });
    }
}
