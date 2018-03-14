package com.example.android.musicplayer;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by krzysztof on 14.03.18.
 */

public class SongAdapter<W> extends ArrayAdapter<Song> {


    public SongAdapter(@NonNull Context context, @NonNull List<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song song = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(song.getmTitle());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(song.getmArtist());

        LinearLayout listItemLinearLayout = listItemView.findViewById(R.id.list_item_linear_layout);
        if (position % 2 == 0) {
            listItemLinearLayout.setBackgroundColor(Color.WHITE);
        } else {
            listItemLinearLayout.setBackgroundColor(Color.parseColor("#FFF6DC"));
        }

        return listItemView;
    }
}
