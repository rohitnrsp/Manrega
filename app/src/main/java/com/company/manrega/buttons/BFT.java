package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class BFT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_f_t);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtbft);
        ComicBook.fromAsset("8.pdf").load();
    }
}
