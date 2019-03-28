package com.example.sanalasistanim;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class smsGonder extends AppCompatActivity {
    Button btnSmsGonderim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_gonder);

        final TextView editTextSMS = (TextView) findViewById(R.id.gönderici_mesaji);
        final TextView editTextTelefonNo = (TextView) findViewById(R.id.alici_telefon_numarasi);

        btnSmsGonderim = (Button) findViewById(R.id.btnSmsGonder);
        btnSmsGonderim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(smsGonder.this, "SMS Gönderiliyor", Toast.LENGTH_SHORT).show();
                //Toast.makeText(smsGonder.this,editTextSMS.getText(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(smsGonder.this,editTextTelefonNo.getText(), Toast.LENGTH_SHORT).show();

                String smsMetni = editTextSMS.getText().toString();
                String telefonNo = editTextTelefonNo.getText().toString();

                Log.i("Bilgi", "TelefonNo:" + telefonNo);
                Log.i("Bilgi", "Sms Metni" + smsMetni);

                Uri uri = Uri.parse("smsto:" + telefonNo);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("smsbody", smsMetni);
                startActivity(intent);


            }
        });
    }
}
