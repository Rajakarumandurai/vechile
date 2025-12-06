package com.vechile.vechile.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vechile.Mapper.InformationMapping;
import com.vechile.vechile.DTO.InformationDTO;
import com.vechile.vechile.Entity.Information;
import com.vechile.vechile.Repository.InformationRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Service
public class InformationServiceImple implements InformationService {
	
	@Autowired
      private InformationRepository informationRepository; 
	@Override
	public InformationDTO createInformationDTO(InformationDTO informDTO) {
		  Information createInf= new Information(); 
		  InformationMapping.mapToInformation(informDTO);
		  
		  Information createDone=new Information();
		  
		  informationRepository.save(createInf);
		return InformationMapping.mapToInformationDTO(createDone);
	}

}
