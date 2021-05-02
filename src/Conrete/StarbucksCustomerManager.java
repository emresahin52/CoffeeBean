package Conrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {

CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	

	@Override

	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.err.println("Not a valid person");
		}
		
	}
	

}
