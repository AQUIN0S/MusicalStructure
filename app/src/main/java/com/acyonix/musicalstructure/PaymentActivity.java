package com.acyonix.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Activate the hyperlink in the TextView
        TextView paymentDescription = (TextView) findViewById(R.id.payment_textview);
        paymentDescription.setMovementMethod(LinkMovementMethod.getInstance());

        // Go back to the shop activity
        Button paidButton = (Button) findViewById(R.id.paid_button);
        paidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openShopActivity = new Intent(PaymentActivity.this, ShopActivity.class);
                startActivity(openShopActivity);
            }
        });
    }
}
