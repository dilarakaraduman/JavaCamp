package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getName()+" "+gamer.getLastname()+" isimli oyuncu "+game.getGameName()+" oyununu "
	+game.getUnitPrice()+" tl ile satin aldi");
		
	}

	@Override
	public void compaignSale(Game game, Gamer gamer,Campaign campaign) {
		System.out.println(gamer.getName()+" "+gamer.getLastname()+ " " + game.getGameName() + " oyununu " + 
				campaign.getName() + " ile %" + campaign.getDiscount() + " indirim ile "
				+ (game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscount()/100))+ " TL ile satin aldi");
		
	}

}
