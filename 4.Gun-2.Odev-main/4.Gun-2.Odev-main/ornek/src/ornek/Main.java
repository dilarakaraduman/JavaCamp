package ornek;

import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import abstracts.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
	customerManager.Save(new Customer(1,"Dilara","Karaduman","31642668624",2000));

	}

}
