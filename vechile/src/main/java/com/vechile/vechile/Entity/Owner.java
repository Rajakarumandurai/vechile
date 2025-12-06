package com.vechile.vechile.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="owner")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String name;
	private String email;
	private String password;	
	private String rcBook;
	private String driverMonthSalary;
	private String oppainment;
	
	public Owner() {
		
	}

	public Owner(long id, String name, String email, String password, String rcBook, String driverMonthSalary,
			String oppainment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.rcBook = rcBook;
		this.driverMonthSalary = driverMonthSalary;
		this.oppainment = oppainment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRcBook() {
		return rcBook;
	}

	public void setRcBook(String rcBook) {
		this.rcBook = rcBook;
	}

	public String getDriverMonthSalary() {
		return driverMonthSalary;
	}

	public void setDriverMonthSalary(String driverMonthSalary) {
		this.driverMonthSalary = driverMonthSalary;
	}

	public String getOppainment() {
		return oppainment;
	}

	public void setOppainment(String oppainment) {
		this.oppainment = oppainment;
	}
	
	
	
	
	
}
