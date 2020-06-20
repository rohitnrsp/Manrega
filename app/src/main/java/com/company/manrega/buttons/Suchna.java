package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Suchna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suchna);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtSuchna);
        ComicBook.fromAsset("17.pdf").load();
    }
}
