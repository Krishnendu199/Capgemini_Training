package objects;

public class Mobile {
    String brand;
    int battery;
    double price;

    public void call() {
        System.out.println(brand + " mobile is calling");
    }

    public void printMobile() {
        System.out.println(brand);
        System.out.println(battery);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m2.brand = "Samsung";
        m2.battery = 80;
        m2.price = 15000;

        m2.call();
        m2.printMobile();

        m1.call();
        m1.printMobile();
    }
}
