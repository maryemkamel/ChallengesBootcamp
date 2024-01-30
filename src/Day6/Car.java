public class Car extends Vehicle{
    public Car(String make, String model, double rentalPrice) {
        super(make, model, rentalPrice);
    }
    @Override
    public void displayInfo() {
        //System.out.println("les information de la voiture sont: ");
        super.displayInfo();
    }
}
