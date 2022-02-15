package adapters;
    import java.rmi.RemoteException;
	import abstracts.CheckServices;
	import entities.Gamer;
	import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

	public class MernisServiceAdapter implements CheckServices  {

		public boolean CheckIfRealPerson(Gamer gamer) {
			
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			
			boolean result = true;
			
			try {
				result = client.TCKimlikNoDogrula(
						Long.parseLong(gamer.getNationalityId()),
						gamer.getName().toUpperCase(),
						gamer.getLastname().toUpperCase(),
						gamer.getDateOfBirth());

			} catch (RemoteException e) {
				result = false;
				System.out.println("Clientte hata");
				e.printStackTrace();
			}
			
			System.out.println(result);
			return result;
		}



	}

