package com.aisharooble.companybusinesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button toDeals;
    private Button toContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDeals = findViewById(R.id.deals);
        toContact = findViewById(R.id.contact);

        toDeals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dealsActivity();
            }
        });

        toContact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contactActivity();
            }
        });

    }

    private void dealsActivity() {
        Intent intent = new Intent(MainActivity.this, DealsActivity.class);
        startActivity(intent);
    }

    private void contactActivity() {
        Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent);
    }

}
