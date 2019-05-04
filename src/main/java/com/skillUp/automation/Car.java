package com.skillUp.automation;

public class Car {
        public String CarColor;
        public String CarModel;

        public Car(String color, String model) {
            CarColor = color;
            CarModel = model;
        }

    @Override
    public String toString() {
        return "Car{" +
                "CarColor='" + CarColor + '\'' +
                ", CarModel='" + CarModel + '\'' +
                '}';
    }
}
