import java.sql.Date;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class Main {

	public static Date DateOfBirth;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
			BaseCustomerManager customermanager = new BaseCustomerManager() {};
			customermanager.Save(new Customer (new Date (1985,1,6),"Emre","Þaihn","28864215111"));
			
	

	}

}
