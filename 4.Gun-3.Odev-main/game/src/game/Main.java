package game;

import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
	  GamerManager gamerManager=new GamerManager();
	  gamerManager.add(new Gamer(1,"Dilara","Karaduman", 2000,"31642668624"));

	  GameManager gameManager=new GameManager();
	  gameManager.add(new Game("Pubg",12));
	  
	  SaleManager saleManager=new SaleManager();
	  saleManager.sale(new Game("Pubg",12),new Gamer(1,"Dilara","Karaduman", 2000,"31642668624"));
	  saleManager.compaignSale(new Game("Pubg", 12), 
				new Gamer(1, "Dilara", "Karaduman", 2000, "31642668624"), 
				new Campaign(1, "Mutis Kampanya!Bahar geldi indirim geldi!Oyunlarda %25 indirim", 25,"BAHAR10"));
	}

}
