import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X-5", 2);
        Car audi = new Car("Audi", "A-8", 1.7);
        Car vesta = new Car("Lada", "Vesta", 1.6);
        Car megane = new Car("Renault", "Megane", 1.8);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(vesta);
        System.out.println(megane);
        audi.pitstop();
        System.out.println();
        Truck maz = new Truck("МАЗ", "535", 5.9);
        Truck hyundai = new Truck("Hyundai", "Mighty", 7);
        Truck kamaz = new Truck("КамАЗ", "65207", 8.2);
        Truck isuzu = new Truck("ISUZU", "ELF", 8.5);
        System.out.println(maz);
        System.out.println(hyundai);
        System.out.println(kamaz);
        System.out.println(isuzu);
        kamaz.maxSpeed();
        System.out.println();
        Bus daewoo = new Bus("Daewoo", "BC212MA", 2.1);
        Bus nefaz = new Bus("НЕФАЗ", "5299-32", 3.4);
        Bus mercedes = new Bus("Mercedes", "Benz Conecto", 5);
        Bus volvo = new Bus("Volvo", "9900", 4.7);
        System.out.println(daewoo);
        System.out.println(nefaz);
        System.out.println(mercedes);
        System.out.println(volvo);
        daewoo.bestTime();
        System.out.println();
        DriverB ivan = new DriverB("Иван", 10);
        ivan.stop(vesta);
        DriverC anton = new DriverC("Антон", 1);
        anton.start(maz);
        DriverD azamat = new DriverD("Азамат", 15);
        azamat.refillCar(mercedes);
        ivan.printInfo(megane);
        anton.printInfo(kamaz);
        azamat.printInfo(nefaz);

    }
}