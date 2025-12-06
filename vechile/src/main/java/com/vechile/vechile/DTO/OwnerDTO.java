package com.vechile.vechile.DTO;

public class OwnerDTO {
	
	
	private long id;
	private String name;
	private String email;
	private String password;	
	private String rcBook;
	private String driverMonthSalary;
	private String oppainment;
	
	public OwnerDTO(){
		
	}

	public OwnerDTO(long id, String name, String email, String password, String rcBook, String driverMonthSalary,
			String oppainment) {
		
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
