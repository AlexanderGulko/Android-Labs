package com.example.listviewlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {

    TextView name;
    TextView charact;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        name = findViewById(R.id.listdata);
        charact = findViewById(R.id.listdatacharact_1);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        charact.setText(intent.getStringExtra("charact"));
        image.setImageResource(intent.getIntExtra("image",0));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
