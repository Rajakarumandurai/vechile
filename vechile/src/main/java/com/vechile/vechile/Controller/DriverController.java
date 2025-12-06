package com.vechile.vechile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechile.vechile.DTO.DriverDTO;
import com.vechile.vechile.Service.DriverService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController //comman controller package
@RequestMapping("/api/driver") //this is base url create own
public class DriverController {
	   
	@Autowired
	  private DriverService driverService;//service layer
	
	
	 //build add driver rest API
	@PostMapping
	 public ResponseEntity<DriverDTO>createDTO(@RequestBody DriverDTO driverDTO){
		DriverDTO savedDriver=driverService.createDriverDTO(driverDTO);
		  
		return new ResponseEntity<>(savedDriver, HttpStatus.OK);
		
	}
	 
	
	//get a DriverId
	@GetMapping({"id"})
	
	public ResponseEntity<DriverDTO>getDriverId(@PathVariable("id") Long driverId ){
		DriverDTO getId=driverService.getDriverId(driverId);
		return new ResponseEntity<>(getId,HttpStatus.OK);
		
		
	}
	
      
}
