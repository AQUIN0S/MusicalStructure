package com.acyonix.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Button goHomeButton = (Button) findViewById(R.id.shop_home_button);
        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMenuActivity = new Intent(ShopActivity.this, MenuActivity.class);
                startActivity(openMenuActivity);
            }
        });

        Button buyFirstSongButton = (Button) findViewById(R.id.buy_song_1_button);
        buyFirstSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaymentActivity = new Intent(ShopActivity.this, PaymentActivity.class);
                startActivity(openPaymentActivity);
            }
        });

        Button buySecondSongButton = (Button) findViewById(R.id.buy_song_2_button);
        buySecondSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaymentActivity = new Intent(ShopActivity.this, PaymentActivity.class);
                startActivity(openPaymentActivity);
            }
        });

    }
}
