package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DetailModel detailModel;
    private ArrayList<DiorModel> diorModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyleview);
        detailModel = new DetailModel(this,diorModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(detailModel);
    }

    private void getData() {
        diorModel = new ArrayList<>();
        diorModel.add(new DiorModel("Bobby Sweater",R.drawable.baju1, "Rp. 41.000.000,00", "Color : Blue Cashmere", "Type : Regular fit", "Size : M", "Back Length : 68 cm", "Collar Type : Ribbed round neck, cuffs and hem", "Made In Italy"  ));
        diorModel.add(new DiorModel("Christian Dior Relaxed-Fit T-Shirt", R.drawable.baju2, "Rp. 20.000.000,00", "Color : Beige", "Type : Relaxed fit", "Size : M", "Back Length : 68 cm", "Collar Type : Ribbed crew neck", "Made In Italy"  ));
        diorModel.add(new DiorModel("Coach Jacket", R.drawable.baju3, "Rp. 30.000.000,00", "Color : Beige", "Type : Cassual fit", "Size : M", "Back Length : 70 cm", "Collar Type : Shirt Collar", "Made In Japan" ));
        diorModel.add(new DiorModel("DIOR AND OTANI WORKSHOP Long-Sleeved Polo Shirt", R.drawable.baju4, "Rp. 40.000.000,00", "Color : Red Cutton", "Type : Cassual fit", "Size : M", "Back Length : 68 cm", "Collar Type : Shirt Collar", "Made In Italy" ));
        diorModel.add(new DiorModel("Prince of Wales-Breasted Jacket", R.drawable.baju5, "Rp. 50.000.000,00", "Color : Gray Wool", "Type : Cassual fit", "Size : L", "Back Length : 76 cm", "Collar Type : Pointed Lapels", "Made In Italy"   ));
        diorModel.add(new DiorModel("Dior Buffalo Lace-Up Boot", R.drawable.sepatu1, "Rp. 29.000.000,00","Color : Black", "Type : Boot" , "Weight : 24 ounces", "Size : 43 cm", "Shoe Type : High-top" , "Made In Italy"));
        diorModel.add(new DiorModel("B57 Mid-Top Sneaker", R.drawable.sepatu2, "Rp. 24.000.000,00", "Color : Blue and Cream","Type : Sneaker", "Weight : 16 ounces","Size : 39 cm" , "Shoe Type : Mid-top", "Made In Italy" ));
        diorModel.add(new DiorModel("B9S Skater Sneaker", R.drawable.sepatu3, "Rp. 43.000.000,00", "Color : Beige", "Type : Sneaker", "Weight : 23.5 ounces", "Size : 42 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new DiorModel("Dior Buffalo Loafer", R.drawable.sepatu4, "Rp. 28.000.000,00","Color : Black", "Type : Loafer", "Weight : 23.5 ounces","Size : 42 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new DiorModel("Dior Granville Loafer", R.drawable.sepatu5, "Rp. 20.000.000,00", "Color : Brown Suede", "Type : Loafer", "Weight : 12.5 ounces", "Size : 36 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new DiorModel("Dior3D S1I", R.drawable.kacamata1, "Rp. 9.900.000,00", "Color : Khaki", "Type : Rectangular Sunglasses","Lenses : 2 Inches", "Bridge : 0.5 Inches", "Frame : Khaki nylon Cannage Frame", "Made In Italy"));
        diorModel.add(new DiorModel("NeoDior S4U", R.drawable.kacamata2, "Rp. 10.500.000,00", "Color : Gray", "Type : Rectangular Sunglasses", "Lenses : 2.5 Inches", "Bridge : 0.5 Inches", "Frame : Gunmetal frame", "Made In Italy"));
        diorModel.add(new DiorModel("CD Diamond M1U", R.drawable.kacamata3, "Rp. 11.500.000,00", "Color : Gray", "Type : Rectangular Sunglasses", "Lenses : 2.5 Inches", "Bridge : 0.5 Inches", "Frame : Gunmetal frame", "Made In Italy"));
        diorModel.add(new DiorModel("CD Diamond S6F", R.drawable.kacamata4, "Rp. 11.800.000,00", "Color : Transparant Green", "Type : Square Sunglasses", "Lenses : 2 Inches", "Bridge : 0.5 Inches","Frame : Transparent beige acetate frame", "Made In Italy"));
        diorModel.add(new DiorModel("DiorBlackSuit S10I", R.drawable.kacamata5, "Rp. 7.460.000,00", "Color : Translucent Beige and Brown", "Type : Rectangular Sunglasses", "Lenses : 2 Inches", "Bridge : 1 Inches", "Frame : Effect acetate frame", "Made In Italy"));
    }
}