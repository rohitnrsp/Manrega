package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Nirdesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nirdesh);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtnirdesh);
        ComicBook.fromAsset("3.pdf").load();
    }
}
