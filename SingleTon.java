public class SingleTon {
    public static void main(String[] args) {
        // Car car2 = new Car(4, "Toyota", "Blue", "Diesel");
        Car car1 = Car.createObj(4, "Toyota", "Blue", "Diesel");
        System.out.println(car1.wheelCount);
        System.out.println(car1.color);
        System.out.println(car1.brandName);
        System.out.println(car1.fuelType);
        System.out.println("****************");
        Car car2 = Car.createObj(4, "TATA", "RED", "Diesel");
        System.out.println(car2.wheelCount);
        System.out.println(car2.color);
        System.out.println(car2.brandName);
        System.out.println(car2.fuelType);
    }
}

class Car {
    static Car obj;
    int wheelCount;
    String brandName;
    String color;
    String fuelType;

    private Car(int wheelCount, String brandName, String color, String fuelType) {
        this.wheelCount = wheelCount;
        this.brandName = brandName;
        this.color = color;
        this.fuelType = fuelType;
    }

    static Car createObj(int wheelCount, String brandName, String color, String fuelType) {
        if (obj == null) {
            obj = new Car(wheelCount, brandName, color, fuelType);
        }
        return obj;
    }
}
