package com.example.android.musicplayer;

/**
 * Created by krzysztof on 14.03.18.
 */

public class Song {

    private String mTitle;
    private String mArtist;

    public Song(String mTitle, String mArtist) {
        this.mTitle = mTitle;
        this.mArtist = mArtist;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }
}
