package Adapters;

import java.rmi.RemoteException;
import abstracts.ICustomerCheckServices;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckServices  {

	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getName().toUpperCase(),
					customer.getLastname().toUpperCase(),
					customer.getDatebirth());

		} catch (RemoteException e) {
			result = false;
			System.out.println("Clientte hata");
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}



}