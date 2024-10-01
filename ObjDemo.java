public class ObjDemo {
    public static void main(String[] args) {
        Car car1 = new Car(4, "tata", "Red", "PETROL");
        System.out.println(car1.brandName);
        System.out.println(car1.wheelCount);
        System.out.println(car1.color);
        System.out.println("*****************");
        Car car2 = new Car(4, "Toyota", "Blue", "Diesel");
        System.out.println(car2.brandName);
        System.out.println(car2.wheelCount);
        System.out.println(car2.color);
    }
}

class Car {
    int wheelCount;
    String brandName;
    String color;
    String fuelType;

    Car(int wheelCount, String brandName, String color, String fuelType) {
        this.wheelCount = wheelCount;
        this.brandName = brandName;
        this.color = color;
        this.fuelType = fuelType;
    }
}
