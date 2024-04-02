package CoreJavaTest1.Question1;

import java.util.List;


public class VehicleRentalSystem {
	   List<Vehicle> vehicles;
	   public VehicleRentalSystem(List<Vehicle> vehicles) { this.vehicles = vehicles; }
	   public void processRentalRequest(RentalRequest rentalRequest) throws VehicleUnavailableException, InvalidRentalPeriodException {
	       if (rentalRequest.getRentalPeriod() < 1) throw new InvalidRentalPeriodException("Invalid rental period.");
	       for (Vehicle vehicle : vehicles) {
	           if (vehicle.getType().equals(rentalRequest.getVehicleType()) && vehicle.isAvailable() && vehicle.getAvailableDays() >= rentalRequest.getRentalPeriod()) {
	               vehicle.setAvailable(false); vehicle.setAvailableDays(vehicle.getAvailableDays() - rentalRequest.getRentalPeriod());
	               double totalCharge = rentalRequest.getRentalPeriod() * 30.0; // Assuming a flat rate of $30 per day
	               System.out.println("Rental Confirmation:\n- Vehicle ID: " +
	vehicle.getId()
	+ "\n- Rental Period: " + rentalRequest.getRentalPeriod() + " Days\n- Total Rental Charge: $" + totalCharge);
	               return;
	           }
	       }
	       throw new VehicleUnavailableException("Requested vehicle type \"" + rentalRequest.getVehicleType() + "\" is unavailable.");
	   }
	}