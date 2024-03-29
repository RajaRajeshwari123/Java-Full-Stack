package layeredarchitectureexample.dao;

import layeredarchitectureexample.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public String addCustomer(Customer customer) {
		System.out.println(customer);
		return "Added successfully";
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomerById(Integer custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
