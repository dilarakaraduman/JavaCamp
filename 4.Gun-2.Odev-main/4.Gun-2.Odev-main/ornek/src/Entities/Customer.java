package Entities;
import abstracts.IEntity;

public class Customer implements IEntity {
private int id;
private String name;
private String lastname;
private String nationalityId;
private int datebirth;

public Customer(int id, String name, String lastname, String nationalityId, int datebirth) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.nationalityId = nationalityId;
	this.datebirth = datebirth;
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
public String getNationalityId() {
	return nationalityId;
}
public void setNationality(String nationalityId) {
	this.nationalityId = nationalityId;
}
public int getDatebirth() {
	return datebirth;
}
public void setDatebirth(int datebirth) {
	this.datebirth = datebirth;
}
}
