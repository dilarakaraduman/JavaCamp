package hafta3;

public class Main {

	public static void main(String[] args) {
		
     UserManager user1=new UserManager();
     User dilara=new User();
     user1.add(dilara);
     StudentManager student1=new StudentManager();
     Student sevval=new Student();
     student1.add(sevval);
     student1.delete(sevval);
     InstructorManager instructor1=new InstructorManager();
     Instructor engin=new Instructor();
     instructor1.add(engin);
     instructor1.update(engin);
	}

}
