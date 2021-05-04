package hafta3;

public class UserManager {
 
	public void add(User user) {
		user.setName("Dilara");
		user.setSurname("Karaduman");
		user.setEmail("dilara_karaduman1@hotmail.com");
		System.out.println("Kullan�c� ad : "+ user.getName()+" \t +Kullan�c� soyad :"+user.getSurname()+"\t Kullan�c� email : "+user.getEmail()
		+"ilgili bilgilere sahip kisi sisteme eklendi");
		System.out.println("--------------------------------------------------------------------------------------");
		
	}
	public void delete(User user) {
		System.out.println("Kullan�c� ad : "+ user.getName()+"\t +Kullan�c� soyad :"+user.getSurname()+"\t Kullan�c� email : "+user.getEmail()
		+"ilgili bilgilerine sahip kullanici sistemden silindi");
		user.setEmail("");
		user.setSurname("");
		user.setEmail("");
		System.out.println("--------------------------------------------------------------------------------------");
	}
	public void update(User user) {
		System.out.println("Kullan�c� ad : "+ user.getName()+"\t +Kullan�c� soyad :"+user.getSurname()+"\t Kullan�c� email : "+user.getEmail()
		+"ilgili bilgilere sahip kisi");
		user.setName("Engin");
		user.setSurname("Demirog");
		user.setEmail("engindemirog@gmail.com");
		System.out.println("Kullan�c� ad : "+ user.getName()+"\t +Kullan�c� soyad :"+user.getSurname()+"\t Kullan�c� email : "+user.getEmail()
		+"olarak guncellendi");
		System.out.println("--------------------------------------------------------------------------------------");
		
	}
}
