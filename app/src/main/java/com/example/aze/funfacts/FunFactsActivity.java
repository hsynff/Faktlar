package com.example.aze.funfacts;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    private ShakeListener shaker;

    private TextView mFactTextView;
    private Boolean allow=true;

    private FactGenerator factGenerator=new FactGenerator();
    private FactGenerator factGenerator2=new FactGenerator();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);

        Toast.makeText(this,"Təsadüfi fakt görmək üçün silkələyin :)",Toast.LENGTH_LONG).show();


        mFactTextView= (TextView) findViewById(R.id.factTextView);

        relativeLayout= (RelativeLayout) findViewById(R.id.relativeLayout);
        final Animation animShake= AnimationUtils.loadAnimation(this,R.anim.anim);

        shaker=new ShakeListener(this);

        shaker.setOnShakeListener(new ShakeListener.OnShakeListener() {
            @Override
            public void onShake() {
                if (allow){
                    generateFactWithVibro(v, animShake);

                }
            }
        });



    }

    private void generateFactWithVibro(Vibrator v, Animation animShake) {
        if (v.hasVibrator()){
            v.vibrate(100);
        }

        int color= Color.parseColor(factGenerator.getColor());

        relativeLayout.setBackgroundColor(color);
        mFactTextView.setText(factGenerator.getFact());
        mFactTextView.startAnimation(animShake);
    }

    @Override
    protected void onPause() {
        super.onPause();
        allow=false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        allow=true;
    }
}
