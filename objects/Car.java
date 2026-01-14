package objects;

public class Car {
    String brand;
    String color;
    int speed;

    public void drive() {
        System.out.println(brand + " car is moving");
    }

    public void printCar() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c2.brand = "Honda";
        c2.color = "Red";
        c2.speed = 80;

        c2.drive();
        c2.printCar();

        c1.drive();
        c1.printCar();
    }
}

