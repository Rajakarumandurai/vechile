package com.vechile.vechile.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vechile.Mapper.DriverMapping;
import com.vechile.vechile.DTO.DriverDTO;
import com.vechile.vechile.Entity.Driver;
import com.vechile.vechile.Exception.ExceptionHandling;
import com.vechile.vechile.Repository.DriverRepository;
import com.vechile.vechile.Entity.Driver;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	 private DriverRepository driverRepository;
	

	@Override
	public DriverDTO createDriverDTO(DriverDTO driverDTO) {
	  Driver driver=DriverMapping.mapToDriver(driverDTO);
	   Driver drivers=driverRepository.save(driver);
		return DriverMapping.mapToDriverDto(drivers);
	}


	@Override
	public DriverDTO getDriverId(Long id) {
		Driver driverId=driverRepository.findById(id).orElseThrow(()-> new ExceptionHandling("this Id not Valid!"+id));
		return DriverMapping.mapToDriverDto(driverId);
	}
	
	
	

}
