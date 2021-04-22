package com.example.tugashero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class Details extends AppCompatActivity {
    ImageView ivHeroPhoto;
    TextView tvHeroName;
    TextView tvHeroSummary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        ivHeroPhoto = findViewById(R.id.ivDetail);
        tvHeroName = findViewById(R.id.tvDetailName);
        tvHeroSummary = findViewById(R.id.tvDetailSum);

        ivHeroPhoto.setImageResource(getIntent().getIntExtra("poto", 0));
        tvHeroName.setText(getIntent().getStringExtra("nama hero"));
        tvHeroSummary.setText(getIntent().getStringExtra("deskripsi"));

        final Button button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}

