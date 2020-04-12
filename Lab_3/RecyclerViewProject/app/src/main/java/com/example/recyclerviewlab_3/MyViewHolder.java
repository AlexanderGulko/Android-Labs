package com.example.recyclerviewlab_3;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyViewHolder extends RecyclerView.ViewHolder {

    private View view;

    MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.view = itemView;
    }

    void bind(final Car car){
        TextView carName = view.findViewById(R.id.carName);
        TextView carYears = view.findViewById(R.id.carYears);
        ImageView carImage = view.findViewById(R.id.carImage);

        carName.setText(car.getCarName());
        carYears.setText(car.getCarYears());
        carImage.setImageResource(car.getImage());

        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(view.getContext(), ClickOnActivity.class);
                        intent.putExtra("car", car);
                        view.getContext().startActivity(intent);
                    }
                }
        );
    }
}