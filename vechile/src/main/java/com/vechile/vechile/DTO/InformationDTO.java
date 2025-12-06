package com.vechile.vechile.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InformationDTO {
	
	private Long id;
	private String wheel;
	private String diesel;
	private String tollGate;
	private String food;
	private String condition;
	private String others;
	private String nextTrip;
	private String dailyDistance;
	        
	
    public InformationDTO() {
	 }


	public InformationDTO(Long id, String wheel, String diesel, String tollGate, String food, String condition,
			String others, String nextTrip, String dailyDistance) {
		
		this.id = id;
		this.wheel = wheel;
		this.diesel = diesel;
		this.tollGate = tollGate;
		this.food = food;
		this.condition = condition;
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
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
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
