public class Car extends Vehicle {
    // Additional field
    private String fuelType;

    // Constructor — calls parent constructor using super()
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);   // initialize Vehicle fields
        this.fuelType = fuelType;
    }

    // Override displayDetails to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails();      // print Vehicle fields first
        System.out.println("Fuel Type : " + fuelType);
    }
}
