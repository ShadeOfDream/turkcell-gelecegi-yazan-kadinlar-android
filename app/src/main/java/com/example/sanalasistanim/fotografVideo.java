package com.example.sanalasistanim;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class fotografVideo extends AppCompatActivity {

    Button btnFotoCek;
    Button btnVideoKayit;

    private static final int VIDEO_ACTION_CODE = 101;
    private static final int IMAGE_ACTION_CODE = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotograf_video);

        btnFotoCek = (Button) findViewById(R.id.btnFotoCek);
        btnVideoKayit = (Button) findViewById(R.id.btnVideoKayit);

        btnFotoCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(takePhotoIntent, IMAGE_ACTION_CODE);

            }
        });
        btnVideoKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(takePictureIntent, VIDEO_ACTION_CODE);

            }
        });
    }

    @Override
    public void onActivityResult(int istekKodu, int sonucKodu, Intent data) {
        super.onActivityResult(istekKodu, sonucKodu, data);

        if (sonucKodu != RESULT_OK)
            return; //sonuç başarısızsa return deyip geri gönderiyor eğer başarısızsa aşğıdai kodlar boşa çalışmasın diye

        switch (istekKodu) {
            case VIDEO_ACTION_CODE:
                VideoView videoView = (VideoView) findViewById(R.id.videoView);
                videoView.setVideoURI(data.getData());
                videoView.setMediaController(new MediaController(this));
                videoView.requestFocus();
                videoView.start();
                break;

            case IMAGE_ACTION_CODE:
                Bundle extras = data.getExtras();
                ((ImageView) findViewById(R.id.imgFoto)).setImageBitmap((Bitmap) extras.get("data"));
                break;

            default:
                break;
        }
    }
}
