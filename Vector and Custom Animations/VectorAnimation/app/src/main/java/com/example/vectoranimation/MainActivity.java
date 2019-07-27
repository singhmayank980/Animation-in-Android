package com.example.vectoranimation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ImageView rocketImage = (ImageView) findViewById(R.id.rocket_image);
            rocketImage.setBackgroundResource(R.drawable.vectordrawable);
            final AnimatedVectorDrawable rocketAnimation = (AnimatedVectorDrawable) rocketImage.getBackground();

            rocketImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rocketAnimation.start();
                }
            });
        }

    }

