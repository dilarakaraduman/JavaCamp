package Concrete;


import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckServices;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckServices customerCheckService;

	public NeroCustomerManager(ICustomerCheckServices customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else System.out.println("Not a valid person");
			

	}
}