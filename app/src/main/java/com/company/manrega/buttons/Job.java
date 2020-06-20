package com.company.manrega.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.company.manrega.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Job extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        PDFView ComicBook = (PDFView) findViewById(R.id.txtJob);
        ComicBook.fromAsset("18.pdf").load();
    }
}
