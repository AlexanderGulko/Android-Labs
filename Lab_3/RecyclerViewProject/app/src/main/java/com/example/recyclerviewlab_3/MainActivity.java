package com.example.recyclerviewlab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi A6 Avant", "2014 - 2018", "Engine capacity: 2.0L\n" +
                "Horse power( useful ): 150\n" +
                "Gearbox: 6M gear", R.drawable.audi_1));
        carList.add(new Car("Ford Mustang", "2009 - 2014", "Engine capacity: 5.0L\n" +
                "Horse power( useful ): 412\n" +
                "Gearbox: 6M gear", R.drawable.ford_1));
        carList.add(new Car("Honda Civic", "2008 - 2012", "Engine capacity: 1.8L\n" +
                "Horse power( useful ): 140\n" +
                "Gearbox: 6A gear", R.drawable.honda_1));
        carList.add(new Car("Mitsubishi EVO", "2007 - ...", "Engine capacity: 2.0L Turbo\n" +
                "Horse power( useful ): 295\n" +
                "Gearbox: 5M gear", R.drawable.mitsu_1));
        carList.add(new Car("Nissan GTR", "2016 - ...", "Engine capacity: 3.8L\n" +
                "Horse power( useful ): 570\n" +
                "Gearbox: 6A gear", R.drawable.nissan_1));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(carList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
