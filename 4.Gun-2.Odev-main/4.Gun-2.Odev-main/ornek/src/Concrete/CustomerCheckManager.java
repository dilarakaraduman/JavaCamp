package Concrete;

import Entities.Customer;
import abstracts.ICustomerCheckServices;

public class CustomerCheckManager implements ICustomerCheckServices{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
