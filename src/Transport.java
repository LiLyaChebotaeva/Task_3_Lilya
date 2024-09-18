public abstract class Transport {
    protected int speed;

    public abstract void move();

}
class Car extends Transport {
    public Car(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Автомобиль движется со скоростью " + speed + " км/ч.");
    }
}

class Bike extends Transport {
    public Bike(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Велосипед движется со скоростью " + speed + " км/ч.");
    }
}

