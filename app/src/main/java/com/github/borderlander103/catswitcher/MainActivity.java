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

    int mChangeImageIndex = 0;

    public void catButton(View view) {

        ImageView catImage = (ImageView) findViewById(R.id.catImageView);


        if (mChangeImageIndex == 0) {

            catImage.setImageResource(R.drawable.cat2);
            mChangeImageIndex = 1;

        }else {

            catImage.setImageResource(R.drawable.cat1);
            mChangeImageIndex = 0;
        }

    }

}


