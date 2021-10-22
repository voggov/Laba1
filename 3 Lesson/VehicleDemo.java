package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

public class VehicleDemo {
    public static void main(String[] args) {
        Car mersedes = new Car(2021, VehicleColor.RED,true,false);
        System.out.println(mersedes.getVehicleInfo());
        System.out.println("////////////////////////");
        Truck kamaz = new Truck(2000,VehicleColor.BLACK,false);
        System.out.println(kamaz.getVehicleInfo());
    }
}
