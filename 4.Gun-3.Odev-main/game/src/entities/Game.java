package entities;

public class Game {
String gameName;
int unitPrice;
public Game(String gameName, int unitPrice) {
	super();
	this.gameName = gameName;
	this.unitPrice = unitPrice;
}
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public int getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}

}
