package transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + "  начинает движение");
    }

    @Override
    void finishMove() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + "  заканчивает движение");
    }

    @Override
    public void pitstop() {
        System.out.println("Проверка технического состояния легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Достигнута максимальная скорость легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Легковой автомобиль" + super.toString();
    }
}