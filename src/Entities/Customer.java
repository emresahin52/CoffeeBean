package Entities;
import java.util.Date;
import Abstract.Entity;



public class Customer extends  Entity {

	public int id;
	public String firstName;
	public String lastName;
	public Date DateOfBirth;
	public String NationalityId;
	


	public Customer(java.sql.Date DateOfBirth, String firstName, String lastName, String nationalityId) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	
	
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	
	public String getNationalityId() {
		return NationalityId;
	}
	
	
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
