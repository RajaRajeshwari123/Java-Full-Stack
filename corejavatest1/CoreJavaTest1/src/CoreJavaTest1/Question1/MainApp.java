package CoreJavaTest1.Question1;
import java.util.List;
import java.util.ArrayList;
public class MainApp {
   public static void main(String[] args) {
       List<Vehicle> vehicles = new ArrayList<>();
       vehicles.add(new Vehicle("1", "Car", true, 5));
       vehicles.add(new Vehicle("2", "Bike", true, 2));
       VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);
       RentalRequest request = new RentalRequest("Car", 3);
       try { 
    	   rentalSystem.processRentalRequest(request);
    	   }catch (VehicleUnavailableException | InvalidRentalPeriodException e) 
       { 
    		   System.out.println("Exception: " + e.getMessage());
    		   }
   }
}