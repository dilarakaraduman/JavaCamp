package hafta3;

public class StudentManager extends UserManager {
    public void add(Student student) {
    	student.setName("Sevval");
		student.setSurname("Karaduman");
		student.setId(1);
		System.out.println("Ogrenci ad : "+ student.getName()+"\t +Ogrenci soyad :"+student.getSurname()+"\t Ogrenci id : "+student.getId()
		+"ilgili bilgilere sahip kisi sisteme eklendi");
		System.out.println("--------------------------------------------------------------------------------------");
    }
    public void delete(Student student) {
    	System.out.println("Ogrenci ad : "+ student.getName()+"\t +Ogrenci soyad :"+student.getSurname()+"\t Ogrenci id : "+student.getId()
		+"ilgili bilgilere sahip kisi sistemden silindi");
    	student.setName("");
		student.setSurname("");
		student.setId(0);
		System.out.println("--------------------------------------------------------------------------------------");
    }
    public void update(User user) {
    	System.out.println("Ogrenci ad : "+ user.getName()+"\t +Ogrenci soyad :"+user.getSurname()+"\t Ogrenci email : "+user.getEmail());
		user.setName("Fatih");
		user.setSurname("Sevdim");
		user.setEmail("fatihsevdim@gmail.com");
		System.out.println("ilgili kisisi");
		System.out.println("Ogrenci ad : "+ user.getName()+"\t +Ogrenci soyad :"+user.getSurname()+"\t Ogrenci email : "+user.getEmail()
		+"olarak guncellendi");
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
