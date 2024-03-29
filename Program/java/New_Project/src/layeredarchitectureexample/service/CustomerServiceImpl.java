package layeredarchitectureexample.service;

import layeredarchitectureexample.dao.CustomerDAO;
import layeredarchitectureexample.dao.CustomerDAOImpl;
import layeredarchitectureexample.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public String addCustomer(Customer customer) {
		CustomerDAO custDAO = new CustomerDAOImpl();
		
		return custDAO.addCustomer(customer);
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