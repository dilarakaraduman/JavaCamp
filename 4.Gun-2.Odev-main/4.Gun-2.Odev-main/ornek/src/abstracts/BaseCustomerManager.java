package abstracts;

import Entities.Customer;
public class BaseCustomerManager implements ICustomerService{

	public void Save(Customer customer) {
		System.out.println("Saved to db "+customer.getName());// TODO Auto-generated method stub
	
	}

}
