package com.vechile.Mapper;

import com.vechile.vechile.DTO.DriverDTO;
import com.vechile.vechile.Entity.Driver;

public class DriverMapping {
	
	
	public static DriverDTO mapToDriverDto(Driver driver) {
	 return new DriverDTO(
			      driver.getId(),
			      driver.getFirstName(),
			      driver.getLastName(),
			      driver.getEmail(),
			      driver.getPassword(),
			      driver.getLiceneceNo(),
			      driver.getDateAndTime(),
			      driver.getPurches(),
			      driver.getDue()
			             );
	}
	
       public static Driver mapToDriver(DriverDTO driver) {
    	   return new Driver(
    			             driver.getId(),
    			             driver.getFirstName(),
    			             driver.getLastName(),
    			             driver.getEmail(),
    			             driver.getPassword(),
    			             driver.getLiceneceNo(),
    			             driver.getDateAndTime(),
    			             driver.getPurches(),
    			             driver.getDue());
       }
}
