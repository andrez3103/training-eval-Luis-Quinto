package net.javaguides.springboot.crudrestfulwebservices.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="employees")

public class Employee {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	@Column(name ="first_Name")
	private String firstName;
	
	@Column(name ="last_Name")
	private String lastName;
	
	@Column(name ="phone_id")
	private String phone;
	

	public Employee() {
		super();
	}

	public Employee(long id, String firstName, String lastName, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
