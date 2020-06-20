package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Panjiyan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panjiyan);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtpanjiyan);
        ComicBook.fromAsset("13.pdf").load();
    }
}
