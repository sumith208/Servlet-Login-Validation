package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registration {
	private String Name;
	@Id
	private String Email;
	private String Password;
	private long Phone_Number;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(long phone_Number) {
		Phone_Number = phone_Number;
	}
	

}
