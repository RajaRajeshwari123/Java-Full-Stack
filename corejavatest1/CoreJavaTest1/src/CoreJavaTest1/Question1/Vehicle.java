package CoreJavaTest1.Question1;

public class Vehicle {
	private String id;
	private String type;
	private boolean available;
	private int availableDays;

	public Vehicle(String id, String type, boolean available, int availableDays) {
		this.id = id;
		this.type = type;
		this.available = available;
		this.availableDays = availableDays;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(int availableDays) {
		this.availableDays = availableDays;
	}
	
}
