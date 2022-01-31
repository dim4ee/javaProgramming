package day43_Abstractions.car;

public class Honda extends Car {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Honda start");
    }
}
