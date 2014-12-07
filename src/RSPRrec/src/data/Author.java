package data;

import java.io.Serializable;

public class Author implements Serializable{

	private String name;
	private int phone;
	private String email;
	private String uid;
	
	public Author(String n, int p, String e, String u) {
		name = n;
		phone = p;
		email = e;
		uid = u;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

}
