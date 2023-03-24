package com.example.mobile_myasnikov_pr2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loadTitle = (TextView)findViewById(R.id.textAct);
        loadTitle.setText(R.string.Successfully);
        ImageView loadPicture = (ImageView)findViewById(R.id.kartinka);
        loadPicture.setImageResource(R.drawable.svgimage);
    }
}