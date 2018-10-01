package com.github.borderlander103.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void catButton(View view) {

        ImageView catImage = (ImageView) findViewById(R.id.catImageView);

        ImageView name = (ImageView) findViewById(R.id.catImageView);




        Log.i("Value", name.toString());

        catImage.setImageResource(R.drawable.cat2);

//        catImage.setImageDrawable(getResources().getDrawable(R.drawable.monkey, getApplicationContext().getTheme()));

    }

}


