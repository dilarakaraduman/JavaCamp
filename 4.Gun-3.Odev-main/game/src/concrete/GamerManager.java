package concrete;

import abstracts.GamerService;
import entities.Game;
import entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Eklenen oyuncu: "+gamer.getName()+" "+gamer.getLastname());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silinen oyuncu: "+gamer.getName()+" "+gamer.getLastname());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Guncellenen oyuncu: "+gamer.getName()+" "+gamer.getLastname());
		
	}

	

}
