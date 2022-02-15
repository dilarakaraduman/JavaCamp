package odev;

public class Main {
	
	public static void main(String[] args) {
		Kurslar kurslar1=new Kurslar();
		kurslar1.name="C# + Angular";
		kurslar1.yuzde=0;
		kurslar1.egitmen="Engin Demirog";
		
		Kurslar kurslar2=new Kurslar();
		kurslar2.name="Java + React";
		kurslar2.yuzde=0;
		kurslar2.egitmen="Engin Demirog";
		
		
		
		Kurslar kurslar3=new Kurslar("Programlamaya Giris Icin Temel Kurs",50,"Engin Demirog" );
		Kurslar[]kurslar= {kurslar1,kurslar2,kurslar3};
		for(Kurslar kurs:kurslar) {
	    System.out.println(kurs.name +kurs.yuzde +kurs.egitmen);
	    
	    Customer customer1=new Customer();
	    customer1.name="Dilara";
	    customer1.id=1;
	    
	    Customer customer2=new Customer("Fatma",2);
	    Customer customer3=new Customer("Sevval",3);
	    Customer[]customer= {customer1,customer2,customer3};
	    for(Customer customers:customer) {
	    	System.out.println(customers.name+customers.id);
	    }
	    Enrollment enrollment =new Enrollment();
	    enrollment.addToList(customer1);
	    enrollment.deleteToList(customer2);
	    enrollment.deleteToList(customer3);
	    
	  
	    }
	   
        } 
	}
}
