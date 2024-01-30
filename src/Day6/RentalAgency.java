import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    public RentalAgency(){
        this.fleet=new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }
    public void rentVehicle(int i){
        if(i>=0 && i<fleet.size()){
            System.out.println("Renting the folowing vehicle !!!");
            fleet.get(i).displayInfo();
            fleet.remove(i);
            System.out.println("this vehicle is rented succesfully  !!!");
        }
        else{
            System.out.println("this vehicle not exist !!!");
        }
    }
    public void displayAllVehicleExists(){
        for(Vehicle vehicles:fleet){
            System.out.println("list of all available vehicle");
            vehicles.displayInfo();
            System.out.println("-------------------------");
        }

    }
public static void main(String[]args){
        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.addVehicle(new Car("Toyota", "model2023", 700.0));
        rentalAgency.addVehicle(new Bike("Fiat", "Model2023", 600.0));
        rentalAgency.addVehicle(new Bike("Dacia", "Model2023", 300.0));
        rentalAgency.addVehicle(new Bike("Kia", "Model2023", 200.0));
        rentalAgency.displayAllVehicleExists();
        rentalAgency.rentVehicle(0);
        rentalAgency.displayAllVehicleExists();

}


}
