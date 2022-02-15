package entities;

import abstracts.Entity;

public class Campaign implements Entity {
    int id;
    String name;
    double discount;
    String code;
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Campaign(int id, String name, double discount, String code) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.code = code;
	}
}
