package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    void finishMove() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitstop() {
        System.out.println("Проверка технического состояния автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Достигнута максимальная скорость автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Автобус" + super.toString();
    }
}