package com.example.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView boxRed;
    private TextView boxBlue;
    private TextView boxGreen;
    private TextView boxYellow;
    private Button buttonRed;
    private Button buttonBlue;
    private Button buttonGreen;
    private Button buttonYellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxRed = (TextView) findViewById(R.id.boxRed);
        boxGreen = (TextView) findViewById(R.id.boxGreen);
        boxBlue = (TextView) findViewById(R.id.boxBlue);
        boxYellow = (TextView) findViewById(R.id.boxYellow);

        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonYellow = (Button) findViewById(R.id.buttonYellow);


        buttonRed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boxRed.setBackgroundColor(getResources().getColor(R.color.red));
                boxGreen.setBackgroundColor(getResources().getColor(R.color.white));
                boxBlue.setBackgroundColor(getResources().getColor(R.color.white));
                boxYellow.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boxRed.setBackgroundColor(getResources().getColor(R.color.white));
                boxGreen.setBackgroundColor(getResources().getColor(R.color.white));
                boxBlue.setBackgroundColor(getResources().getColor(R.color.blue));
                boxYellow.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boxRed.setBackgroundColor(getResources().getColor(R.color.white));
                boxGreen.setBackgroundColor(getResources().getColor(R.color.green));
                boxBlue.setBackgroundColor(getResources().getColor(R.color.white));
                boxYellow.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boxRed.setBackgroundColor(getResources().getColor(R.color.white));
                boxGreen.setBackgroundColor(getResources().getColor(R.color.white));
                boxBlue.setBackgroundColor(getResources().getColor(R.color.white));
                boxYellow.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });


    }
}
