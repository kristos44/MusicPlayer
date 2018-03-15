package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView titleTextView = findViewById(R.id.song_title_text_view);
        titleTextView.setText(getIntent().getStringExtra("title"));

        TextView artistTextView = findViewById(R.id.song_artist_text_view);
        artistTextView.setText(getIntent().getStringExtra("artist"));
    }
}
