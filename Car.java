class Vehicle {
    int wheels;
    String name;

    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    void getDetails() {
        System.out.println("Vehicle Details: " + wheels + " " + name);
    }
}

class Car extends Vehicle {
    int millage;
    String model;

    public Car(int wheels, String name, int millage, String model) {
        super(wheels, name);
        this.millage = millage;
        this.model = model;
    }

    void getDetails() {
        System.out.println("Car Details: " + model + " " + millage);
        super.getDetails();
    }

    public static void main(String args[]) {
        Car car = new Car(4, "Skoda", 20, "Superb");
        car.getDetails();
    }
}