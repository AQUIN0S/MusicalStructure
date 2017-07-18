package com.acyonix.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_music);

        Button playFirstSongButton = (Button) findViewById(R.id.song_1_button);
        playFirstSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlayMusicActivity = new
                        Intent(ShowMusicActivity.this, PlayMusicActivity.class);
                startActivity(openPlayMusicActivity);
            }
        });

        Button playSecondSongButton = (Button) findViewById(R.id.song_2_button);
        playSecondSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlayMusicActivity = new
                        Intent(ShowMusicActivity.this, PlayMusicActivity.class);
                startActivity(openPlayMusicActivity);
            }
        });

    }

}
