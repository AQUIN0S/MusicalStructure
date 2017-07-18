package com.acyonix.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    /**
     * This is the launch activity of the app. The user may choose to list all songs, list songs by
     * artists, by album or go to the store to buy more songs.
     *
     * When the all songs button is clicked it will move to ShowMusicActivity.
     *
     * If the Artists or Album buttons are selected, then another activity may be created which
     * shows more options, but this is similar enough in functionality to this activity that I'm not
     * going to make these buttons do anything.
     *
     * When the Shop button is selected, then the app will move to ShopActivity.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // When all_songs_button is clicked open ShowMusicActivity
        Button allSongsButton = (Button) findViewById(R.id.all_songs_button);
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAllSongs = new Intent(MenuActivity.this, ShowMusicActivity.class);
                startActivity(openAllSongs);
            }
        });

        // When shop_button is clicked open ShopActivity
        Button shopButton = (Button) findViewById(R.id.shop_button);
        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openShop = new Intent(MenuActivity.this, ShopActivity.class);
                startActivity(openShop);
            }
        });

    }
}
