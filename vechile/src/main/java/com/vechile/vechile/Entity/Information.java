package com.vechile.vechile.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="information")

public class Information {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	

	private String wheel;
	
	
	private String diesel;
	
	
	private String tollGate;
	

	private String food;
	
	private String vechile_conditions;
	
	
	private String others;
	
	
	private String nextTrip;
	
	
	private String dailyDistance;


	
	
	
  public Information() { 
	  
  }


  public Information(Long id, String wheel, String diesel, String tollGate, String food, String vechile_conditions, String others,
		String nextTrip, String dailyDistance) {
	  super();
	
	this.id = id;
	this.wheel = wheel;
	this.diesel = diesel;
	this.tollGate = tollGate;
	this.food = food;
	this.vechile_conditions = vechile_conditions;
	this.others = others;
	this.nextTrip = nextTrip;
	this.dailyDistance = dailyDistance;
  }


  public Long getId() {
	return id;
  }


  public void setId(Long id) {
	this.id = id;
  }


  public String getWheel() {
	return wheel;
  }


  public void setWheel(String wheel) {
	this.wheel = wheel;
  }


  public String getDiesel() {
	return diesel;
  }


  public void setDiesel(String diesel) {
	this.diesel = diesel;
  }


  public String getTollGate() {
	return tollGate;
  }


  public void setTollGate(String tollGate) {
	this.tollGate = tollGate;
  }


  public String getFood() {
	return food;
  }


  public void setFood(String food) {
	this.food = food;
  }


  public String getCondition() {
	return vechile_conditions;
  }


  public void setCondition(String condition) {
	this.vechile_conditions = condition;
  }


  public String getOthers() {
	return others;
  }


  public void setOthers(String others) {
	this.others = others;
  }


  public String getNextTrip() {
	return nextTrip;
  }


  public void setNextTrip(String nextTrip) {
	this.nextTrip = nextTrip;
  }


  public String getDailyDistance() {
	return dailyDistance;
  }


  public void setDailyDistance(String dailyDistance) {
	this.dailyDistance = dailyDistance;
  }
  
  
}
