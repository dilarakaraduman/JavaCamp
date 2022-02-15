package odev;

public class Kurslar {
 public  Kurslar(){ System.out.println("Ben calistim");}
 
 public Kurslar(String name,int yuzde,String egitmen) {
	 this();
	 this.name=name;
	 this.yuzde=yuzde;
	 this.egitmen=egitmen;
 }
 String name;
 int yuzde;
 String egitmen;
}
