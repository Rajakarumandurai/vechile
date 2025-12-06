package com.vechile.vechile.Service;

import com.vechile.vechile.DTO.DriverDTO;

public interface DriverService {
	//this is abstract method using another class  implementation 
	DriverDTO createDriverDTO( DriverDTO driverDTO);
	DriverDTO getDriverId(Long id);

}
