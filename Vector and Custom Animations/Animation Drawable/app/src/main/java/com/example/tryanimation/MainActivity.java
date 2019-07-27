package com.example.tryanimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView iv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_splash=(ImageView)findViewById(R.id.iv_splash);
        iv_splash.setBackgroundResource(R.drawable.rocket_thrust);
        final AnimationDrawable progressAnimation =(AnimationDrawable)iv_splash.getBackground();
        progressAnimation.start();
    }
}
