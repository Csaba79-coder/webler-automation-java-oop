package hu.webler.model;

// // Car osztály, amely egy járművet reprezentál
public class Car {

    // Adattagok (Fields)
    private String brand; // autó márkája
    private int speed; // autó sebessége
    private double fuel; // üzemanyagszint

    // ha van paraméteres konstruktor a default üres megszűnik létezni, nekünk kell manuálisan létrehozni!
    public Car() {

    }

    // Konstruktor
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.fuel = 100.0;
    }

    // Getter metódus az adattagok elérése
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    // Setter metódus az adattagok beálltása (érték hozzárendelése)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand: " + this.brand +
                ", speed: " + this.speed +
                ", fuel: " + this.fuel + "}";
    }
}
