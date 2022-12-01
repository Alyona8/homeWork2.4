package transport;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMove() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + "  начинает движение");
    }

    @Override
    void finishMove() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitstop() {
        System.out.println("Проверка технического состояния грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Достигнута максимальная скорость грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль" + super.toString();
    }
}