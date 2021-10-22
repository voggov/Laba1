package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

import java.util.Random;

public abstract class Vehicle {

    public String vin;
    public int yearOfProduction;
    public VehicleColor color;

    public Vehicle (int yearOfProduction, VehicleColor color)
    {
        this.vin = generateVin();
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public String getVin(){
        return this.vin;
    }

    public int getYearOfProduction(){
        return this.yearOfProduction;
    }

    public VehicleColor getColor(){
        return this.color;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }
    public void setYearOfProduction(int yearOfProduction)
    {
        this.yearOfProduction = yearOfProduction;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    /**
     * @return Информация о машине
     */
    public abstract String getVehicleInfo();

    /**
     * Метод генерирует псевдо-случайный идентификационный номер транспортного средства.
     * Данный номер используется в целях обучения и не соответствует ISO 3779-1983 и ISO 3780.
     * Переделывать или вносить изменения в этот метод не требуется.
     *
     * @return псевдо-уникальный VIN
     */
    private static String generateVin() {
        var source = "ABCDEFGHJKLMNPQRSTUVWXYZ1234567890";
        var sb = new StringBuilder();
        int i = 0;
        var random = new Random();
        while (i < 17) {
            sb.append(source.charAt(random.nextInt(source.length())));
            i++;
        }
        return sb.toString();
    }
}
