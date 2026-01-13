package methods;

public class Fan {
    String brand;
    int speed;
    boolean isOn;

    public void switchOn() {
        System.out.println(brand + " fan is ON");
    }

    public void printFan() {
        System.out.println(brand);
        System.out.println(speed);
        System.out.println(isOn);
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f2.brand = "Usha";
        f2.speed = 3;
        f2.isOn = true;

        f2.switchOn();
        f2.printFan();

        f1.switchOn();
        f1.printFan();
    }
}

