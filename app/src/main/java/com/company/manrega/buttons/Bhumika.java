package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Bhumika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhumika);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtbhumika);
        ComicBook.fromAsset("6.pdf").load();
    }
}
