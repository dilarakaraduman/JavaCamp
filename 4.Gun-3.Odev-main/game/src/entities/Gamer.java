package entities;
import abstracts.Entity;

public class Gamer implements Entity {
int id;
String name;
String lastname;
String email;
int dateOfBirth;
String nationalityId;
   public Gamer(int id, String name, String lastname,  int dateOfBirth, String nationalityId) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.lastname = lastname;
	  this.dateOfBirth = dateOfBirth;
	  this.nationalityId = nationalityId;
   }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getLastname() {
	return lastname;
  }
  public void setLastname(String lastname) {
	this.lastname = lastname;
  }
  public int getDateOfBirth() {
	return dateOfBirth;
  }
  public void setDateOfBirth(int dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
  }
  public String getNationalityId() {
	return nationalityId;
  }
  public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
  }
   
   

}
