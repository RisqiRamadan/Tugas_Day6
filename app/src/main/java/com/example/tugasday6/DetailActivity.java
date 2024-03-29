package com.example.tugasday6;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class DetailActivity extends AppCompatActivity {

    private String nama;
    private int logo;
    private String detailHargaB, detailWarnaB, detailTipeB, detailTipeKerah, detailUkuranB, detailUPanjangB, detailDibuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EdgeToEdge.enable(this);


        nama = getIntent().getStringExtra("nama");
        logo = getIntent().getIntExtra("logo",0);


        detailHargaB = getIntent().getStringExtra("detail_tambahan2");
        detailWarnaB = getIntent().getStringExtra("detail_tambahan3");
        detailTipeB = getIntent().getStringExtra("detail_tambahan4");
        detailUkuranB = getIntent().getStringExtra("detail_tambahan5");
        detailUPanjangB = getIntent().getStringExtra("detail_tambahan6");
        detailTipeKerah = getIntent().getStringExtra("detail_tambahan7");
        detailDibuat = getIntent().getStringExtra("detail_tambahan8");

        if (detailHargaB == null) {
            detailHargaB = "";
        }
        if (detailWarnaB == null) {
            detailWarnaB = "";
        }


        TextView namaDetail = findViewById(R.id.tvnamaproduk);
        ImageView logoDetail = findViewById(R.id.ivproduk);
        TextView detailHargaBtv = findViewById(R.id.tvhargaproduk);
        TextView detailWarnaBtv = findViewById(R.id.tvwarnaproduk);
        TextView detailTipeBtv = findViewById(R.id.tvtipeproduk);
        TextView detailUkuranBtv = findViewById(R.id.tvukuranbesarproduk);
        TextView detailUPanjangBtv = findViewById(R.id.tvukuranpanjangproduk);
        TextView detailTipeKerahtv = findViewById(R.id.tvtipekerah);
        TextView detailDibuattv = findViewById(R.id.tvdibuat);

        namaDetail.setText(nama);
        logoDetail.setImageResource(logo);

        detailHargaBtv.setText(detailHargaB);
        detailWarnaBtv.setText(detailWarnaB);
        detailTipeBtv.setText(detailTipeB);
        detailUkuranBtv.setText(detailUkuranB);
        detailUPanjangBtv.setText(detailUPanjangB);
        detailTipeKerahtv.setText(detailTipeKerah);
        detailDibuattv.setText(detailDibuat);
    }


    public void shareItem(View view) {

        String textToShare = "Nama: " + nama + "\n" + detailHargaB + "\n" +  detailWarnaB + "\n" + detailTipeB + "\n" + detailUkuranB + "\n" + detailUPanjangB + "\n" + detailTipeKerah + "\n" + detailDibuat ;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);

        startActivity(Intent.createChooser(shareIntent, "Bagikan"));
    }
}