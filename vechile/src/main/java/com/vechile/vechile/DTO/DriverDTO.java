package com.vechile.vechile.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class DriverDTO { 
	
	
	 private long id;
    
    private String firstName;
    
    private String lastName;
        private String email;
     
    private String password;
     private  String LiceneceNo;
    
     private Long dateAndTime;
     
     private String purches;
    
     private long due;
     
     public DriverDTO() {
    	 
     }

	 public DriverDTO(long id, String firstName, String lastName, String email, String password, String liceneceNo,
			Long dateAndTime, String purches, long due) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		LiceneceNo = liceneceNo;
		this.dateAndTime = dateAndTime;
		this.purches = purches;
		this.due = due;
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

	 public String getLiceneceNo() {
		 return LiceneceNo;
	 }

	 public void setLiceneceNo(String liceneceNo) {
		 LiceneceNo = liceneceNo;
	 }

	 public Long getDateAndTime() {
		 return dateAndTime;
	 }

	 public void setDateAndTime(Long dateAndTime) {
		 this.dateAndTime = dateAndTime;
	 }

	 public String getPurches() {
		 return purches;
	 }

	 public void setPurches(String purches) {
		 this.purches = purches;
	 }

	 public long getDue() {
		 return due;
	 }

	 public void setDue(long due) {
		 this.due = due;
	 }
	 
	 

}
