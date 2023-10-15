package dz2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VechicleTest {

    @Test
    public void testCarInstanceIsVehicleInstance() {
        Car car = new Car("KIA","RIO",2013);
        assertTrue(car instanceof Vehicle, "Car instance should also be an instance of Vehicle");
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("KIA","RIO",2013);
        assertEquals(4, car.getNumWheels(), "Car should have 4 wheels");
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley","Davidson",2013);
        assertEquals(2, motorcycle.getNumWheels(), "Motorcycle should have 2 wheels");
    }

    @Test
    public void testCarSpeedAfterTestDrive() {
        Car car = new Car("KIA","RIO",2013);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Car should have speed of 60 after test drive");
    }

    @Test
    public void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley","Davidson",2013);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle should have speed of 75 after test drive");
    }

    @Test
    public void testCarSpeedAfterPark() {
        Car car = new Car("KIA","RIO",2013);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car should have speed of 0 after parking");
    }

    @Test
    public void testMotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Harley","Davidson",2013);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle should have speed of 0 after parking");
    }
}