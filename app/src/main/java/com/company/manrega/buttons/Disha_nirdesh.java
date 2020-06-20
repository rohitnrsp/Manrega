package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Disha_nirdesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha_nirdesh);
       PDFView  ComicBook = (PDFView) findViewById(R.id.disha_nirdesh);
        ComicBook.fromAsset("1.pdf").load();
    }
}
