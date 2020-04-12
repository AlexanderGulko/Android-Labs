package com.example.recyclerviewlab_3;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName;
    private String carYears;
    private String carCharact;
    private int image;

    public Car(String carName, String carYears, String carCharact, int image) {
        this.carName = carName;
        this.carYears = carYears;
        this.carCharact = carCharact;
        this.image = image;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarYears() {
        return carYears;
    }

    public void setCarYears(String carYears) {
        this.carYears = carYears;
    }

    public String getCarCharact() {
        return carCharact;
    }

    public void setCarCharact(String carCharact) {
        this.carCharact = carCharact;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }




}
