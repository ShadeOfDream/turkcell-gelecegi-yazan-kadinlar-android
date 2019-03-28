package com.example.sanalasistanim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText kullaniciAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Bilgi", "Giris Yap method'u çalışmasına başlıyor...");
        kullaniciAdi = (EditText) findViewById(R.id.txtKullaniciAdi);
    }

    public void GirisYap(View view) {

        String KullaniciAdi = kullaniciAdi.getText().toString();
        EditText parola = (EditText) findViewById(R.id.txtParola);
        Log.e("Bilgi", "Kullanıcı 'Kullanıcı Adı' olarak " + KullaniciAdi + " girdi.");
        //Log.e("Bilgi", "Kullanıcı 'Kullanıcı Adı' olarak " + kullaniciAdi.getText().toString() + " girdi.");
        Log.e("Bilgi", "Kullanıcı 'Parola' olarak " + parola.getText() + " girdi.");
        Log.i("Bilgi", "Kullanıcının Bilgileri sistemde olup olmadığı kontrol ediliyor..");

        //EditText yeniKullaniciAdi = (EditText) findViewById(R.id.txtKullaniciAdi);
        //String ad = yeniKullaniciAdi.getText().toString();

        Log.i("Bilgi", "Main Activity burada bitmiştir... ");

        Intent hosgeldinizActivity = new Intent(this, menuSayfasi.class);
        hosgeldinizActivity.putExtra("MainActivityKullaniciAdi", KullaniciAdi);
        startActivity(hosgeldinizActivity);
        Log.i("Bilgi", "menuSayfasi intenti burada başlamıştır... ");
    }
}