package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class GoodGov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_gov);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtgoodgov);
        ComicBook.fromAsset("14.pdf").load();
    }
}
