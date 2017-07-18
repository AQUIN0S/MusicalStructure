package com.acyonix.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        Button allSongsButton = (Button) findViewById(R.id.view_all_songs_button);
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openShowMusicActivity = new Intent(PlayMusicActivity.this,
                        ShowMusicActivity.class);
                startActivity(openShowMusicActivity);
            }
        });

        Button settingsButton = (Button) findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSettingsActivity = new Intent(PlayMusicActivity.this,
                        SettingsActivity.class);
                startActivity(openSettingsActivity);
            }
        });

        /*
         * Because a playlist activity is so similar to a view songs activity, this button will just
         * lead back to ShowMusicActivity.
         */
        Button playlistButton = (Button) findViewById(R.id.view_playlist_button);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openShowMusicActivity = new Intent(PlayMusicActivity.this,
                        ShowMusicActivity.class);
                startActivity(openShowMusicActivity);
            }
        });
    }
}
