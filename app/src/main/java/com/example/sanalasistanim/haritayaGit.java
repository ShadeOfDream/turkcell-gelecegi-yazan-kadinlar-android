package com.example.sanalasistanim;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class haritayaGit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haritaya_git);
    }

    public void HaritayiAc(View view) {
        Uri geolocation = Uri.parse("geo:41,00527,28,97696");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geolocation);
        startActivity(intent);
    }
}
