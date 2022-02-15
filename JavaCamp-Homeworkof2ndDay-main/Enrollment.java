package odev;

public class Enrollment {

	public void addToList(Customer customer) {
		
		System.out.println(customer.name +customer.id+"ilgili bilgilere sahip kiþi eklendi");
	}
	public void deleteToList(Customer customer) {
		
		System.out.println(customer.name +customer.id+"ilgili bilgilere sahip kiþi silindi");
		customer.name="";
		customer.id=0;
	}
 
}

