package Concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckServices;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
   
	private ICustomerCheckServices customerCheckServices;
	
    public StarbucksCustomerManager(ICustomerCheckServices customerCheckServices) {
		this.customerCheckServices = customerCheckServices;
	}
    
    @Override
	public void Save(Customer customer) {
		
		if(customerCheckServices.CheckIfRealPerson(customer)) {
			System.out.println("Kayit edildi"+customer.getName());
			super.Save(customer);
		}
		else{
			System.out.println("Kisi bulunamadý.Gercek bir kullanýcý giriniz!");
		}

	
	}





	
}
