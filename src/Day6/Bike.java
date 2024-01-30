public class Bike extends Vehicle{
    public Bike(String make, String model, double rentalPrice) {
        super(make, model, rentalPrice);
    }

    @Override
    public void displayInfo() {
        //System.out.println("les information de velo sont: ");
        super.displayInfo();
    }
}
