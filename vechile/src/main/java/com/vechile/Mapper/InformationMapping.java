package com.vechile.Mapper;

import com.vechile.vechile.DTO.InformationDTO;
import com.vechile.vechile.Entity.Information;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InformationMapping { 

	public static InformationDTO mapToInformationDTO(Information inform) {

		return new InformationDTO(
				                  inform.getId(),
				                  inform.getWheel(),
				                  inform.getDiesel(),
				                  inform.getTollGate(),
				                  inform.getFood(),
				                  inform.getCondition(),
				                  inform.getOthers(),
				                  inform.getNextTrip(),
				                  inform.getDailyDistance()
				                  );
		
	}
	
	public static Information mapToInformation(InformationDTO informDTO) {
		 return new Information(
				                informDTO.getId(),
				                informDTO.getWheel(),
				                informDTO.getCondition(),
				                informDTO.getTollGate(),
				                informDTO.getFood(),
				                informDTO.getCondition(),
				                informDTO.getOthers(),
				                informDTO.getNextTrip(),
				                informDTO.getDailyDistance());
	}
	
	
}
