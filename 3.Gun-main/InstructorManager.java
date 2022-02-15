package hafta3;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
    	instructor.setName("Engin");
		instructor.setSurname("Demirog");
		instructor.setId(1);
		System.out.println("Egitmen ad : "+ instructor.getName()+"\t +Egitmen soyad :"+instructor.getSurname()+"\t Egitmen id : "+instructor.getId()
		+"ilgili bilgilere sahip kisi sisteme eklendi");
		System.out.println("--------------------------------------------------------------------------------------");
    }
    public void delete(Instructor instructor) {
    	System.out.println("Egitmen ad : "+ instructor.getName()+"\t +Egitmen soyad :"+instructor.getSurname()+"\t Egitmen id : "+instructor.getId()
		+"ilgili bilgilere sahip kisi sistemden silindi");
    	instructor.setName("");
		instructor.setSurname("");
		instructor.setId(0);
		System.out.println("--------------------------------------------------------------------------------------");
		
    }
    public void update(Instructor instructor) {
    	System.out.println("Egitmen ad : "+ instructor.getName()+"\t +Egitmen soyad :"+instructor.getSurname()+"\t Egitmen id : "+instructor.getId()+
				" ilgili bilgilere sahip kisi");
		instructor.setName("Fatih");
		instructor.setSurname("Sevdim");
		instructor.setId(2);
		System.out.println("Egitmen ad : "+ instructor.getName()+"\t +Egitmen soyad :"+instructor.getSurname()+"\t Egitmen id : "+instructor.getId()+
				" olarak guncellendi");
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
