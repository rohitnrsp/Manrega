package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class GramPanchayat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram_panchayat);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtgrampanch);
        ComicBook.fromAsset("7.pdf").load();
    }
}
