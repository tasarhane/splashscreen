package com.tasarhane.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class AcilisEkrani extends Activity {

    private static int gosterim_suresi = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acilis_ekrani);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AcilisEkrani.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, gosterim_suresi);
    }
}


