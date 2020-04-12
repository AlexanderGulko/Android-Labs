package com.example.listviewlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] carNames = {"Audi A6 Avant","Ford Mustang","Honda Civic","Mitsubishi EVO","Nissan GTR"};
    String[] carYears = {"2014-2018","2009-2014","2008-2012","2007-...","2016-..."};
    String[] carCharact = {"Engine capacity: 2.0L\n" +
            "Horse power( useful ): 150\n" +
            "Gearbox: 6M gear",
            "Engine capacity: 5.0L\n" +
            "Horse power( useful ): 412\n" +
            "Gearbox: 6M gear",
            "Engine capacity: 1.8L\n" +
            "Horse power( useful ): 140\n" +
            "Gearbox: 6A gear",
            "Engine capacity: 2.0L Turbo\n" +
            "Horse power( useful ): 295\n" +
            "Gearbox: 5M gear",
            "Engine capacity: 3.8L\n" +
            "Horse power( useful ): 570\n" +
            "Gearbox: 6A gear"};

    int[] carImages = {R.drawable.audi_1,R.drawable.ford_1,R.drawable.honda_1,R.drawable.mitsu_1,R.drawable.nissan_1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewdata);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ListdataActivity.class);
                intent.putExtra("name", carNames[i]);
                intent.putExtra("years", carYears[i]);
                intent.putExtra("charact", carCharact[i]);
                intent.putExtra("image", carImages[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return carImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.raw_data, null);
            TextView name = view1.findViewById(R.id.cars);
            TextView years = view1.findViewById(R.id.years);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(carNames[i]);
            years.setText(carYears[i]);
            image.setImageResource(carImages[i]);
            return view1;
        }
    }
}
