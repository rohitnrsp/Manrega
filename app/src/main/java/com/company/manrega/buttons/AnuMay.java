package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AnuMay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anu_may);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtanumay);
        ComicBook.fromAsset("5.pdf").load();
    }
}
