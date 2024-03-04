package hu.webler;

import hu.webler.model.Car;

public class OopApp {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car); // amig nem volt toString -> hu.webler.model.Car@5b480cf9
        Car opel = new Car("Opel");
        System.out.println(opel); // amig nem volt toString -> hu.webler.model.Car@6f496d9f

        String brand = opel.getBrand();
        System.out.println(brand);
        String newBrand = "BMW";
        opel.setBrand(newBrand);
        System.out.println(opel);
        opel.setSpeed(160);
        System.out.println(opel);
    }
}
