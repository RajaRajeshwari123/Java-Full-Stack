package New_Project.association;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustId(1);
		customer.setCustName("Billy");
		
		Address address=new Address();
		address.setAddressId(1);
		address.setHouseNo(1);
		address.setStreet("Parvath Nagar");
		address.setCity("Hyderabad");
		address.setCountry("India");
		System.out.println(customer);
		System.out.println(address);

	}

}
