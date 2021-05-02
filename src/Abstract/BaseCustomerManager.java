package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager extends CustomerService {
	
	public void Save(Customer customer) {
		
		System.out.println("Saved to db  :"+customer.firstName);
	}

	public void save(Customer customer) {
		
		
	}
	

}
