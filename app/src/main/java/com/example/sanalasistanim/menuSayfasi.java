package com.example.sanalasistanim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuSayfasi extends AppCompatActivity implements View.OnClickListener {

    Button btnHarita;
    Button btnWebSayfa;
    Button btnSesKayit;
    Button btnArama;
    Button btnSms;
    Button btnFotografVid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sayfasi);

        Bundle getBundle = getIntent().getExtras();
        String gelenDeger = getBundle.getString("MainActivityKullaniciAdi");
        TextView merhaba = (TextView) findViewById(R.id.txtText);
        String ekranaYazdirdigim = merhaba.getText().toString();
        merhaba.setText(gelenDeger.toUpperCase() + " " + ekranaYazdirdigim);
        Log.i("bilgi", "gelen değer: " + gelenDeger);

        btnHarita = (Button) findViewById(R.id.btnHarita);
        btnHarita.setOnClickListener((View.OnClickListener) this);

        btnWebSayfa = (Button) findViewById(R.id.btnWeb);
        btnWebSayfa.setOnClickListener((View.OnClickListener) this);

        btnSesKayit = (Button) findViewById(R.id.btnSesKayit);
        btnSesKayit.setOnClickListener((View.OnClickListener) this);

        btnArama = (Button) findViewById(R.id.btnArama);
        btnArama.setOnClickListener((View.OnClickListener) this);

        btnSms = (Button) findViewById(R.id.btnSms);
        btnSms.setOnClickListener((View.OnClickListener) this);

        btnFotografVid = (Button) findViewById(R.id.btnFotografVideo);
        btnFotografVid.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view) {
        if (view == btnHarita) {
            Intent intentHarita = new Intent(menuSayfasi.this, haritayaGit.class);
            startActivity(intentHarita);
        } else if (view == btnWebSayfa) {
            Intent intentWeb = new Intent(menuSayfasi.this, webSayfasinaGit.class);
            startActivity(intentWeb);

        } else if (view == btnSesKayit) {
            Intent intentSes = new Intent(menuSayfasi.this, sesKayitIslemi.class);
            startActivity(intentSes);

        } else if (view == btnArama) {
            Intent intentAra = new Intent(menuSayfasi.this, aramaYap.class);
            startActivity(intentAra);

        } else if (view == btnSms) {
            Intent intentSms = new Intent(menuSayfasi.this, smsGonder.class);
            startActivity(intentSms);

        } else {
            Intent intentFotoVid = new Intent(menuSayfasi.this, fotografVideo.class);
            startActivity(intentFotoVid);
        }


    }
}
