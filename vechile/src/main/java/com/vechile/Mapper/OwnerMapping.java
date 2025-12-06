package com.vechile.Mapper;

import com.vechile.vechile.DTO.OwnerDTO;
import com.vechile.vechile.Entity.Owner;

public class OwnerMapping { 
	      
	public static OwnerDTO mapToOwnerDTO(Owner owner) {
		 
		return new OwnerDTO(
				owner.getId(),
				owner.getName(),
				owner.getEmail(),
				owner.getPassword(),
				owner.getRcBook(),
				owner.getDriverMonthSalary(),
				owner.getOppainment());
				       				
				
		
	}
	
	
	
	public static Owner mapToOwner(OwnerDTO ownerDTO) {
		  return new Owner(ownerDTO.getId(),
				  ownerDTO.getName(),
				  ownerDTO.getEmail(),
				  ownerDTO.getPassword(),
				  ownerDTO.getRcBook(),
				  ownerDTO.getDriverMonthSalary(),
				  ownerDTO.getOppainment());
	}
	

}
