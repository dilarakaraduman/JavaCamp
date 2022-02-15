package concrete;

import abstracts.CampaignService;
import entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
	System.out.println("Eklenen kampanya: "+campaign.getName()+" ve "+campaign.getCode()+" kodu");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Silinen kampanya: "+campaign.getName()+" ve "+campaign.getCode()+" kodu");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Guncellenen kampanya: "+campaign.getName()+" ve "+campaign.getCode()+" kodu");
		
	}


}
