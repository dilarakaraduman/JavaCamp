package odev;

public class Enrollment {

	public void addToList(Customer customer) {
		
		System.out.println(customer.name +customer.id+"ilgili bilgilere sahip ki�i eklendi");
	}
	public void deleteToList(Customer customer) {
		
		System.out.println(customer.name +customer.id+"ilgili bilgilere sahip ki�i silindi");
		customer.name="";
		customer.id=0;
	}
 
}

