package CoreJavaTest1.Question1;

public class RentalRequest {
	private String vehicleType;
	private int rentalPeriod;

	public RentalRequest(String vehicleType, int rentalPeriod) {
		this.vehicleType = vehicleType;
		this.setRentalPeriod(rentalPeriod);
	}

	public int getRentalPeriod() {
		return rentalPeriod;
	}
	

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}
}
	