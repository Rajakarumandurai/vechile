package com.vechile.vechile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechile.vechile.DTO.InformationDTO;
import com.vechile.vechile.Service.InformationService;

@Component
@Controller
@RestController
@RequestMapping("/api/information")
public class InformationController {
	
	@Autowired
	 private InformationService informationService;//this information object stored for post details save and set
	
	@PostMapping
	
	public ResponseEntity<InformationDTO>createAllInformation(@RequestBody InformationDTO infDTO){
		InformationDTO fetching=informationService.createInformationDTO(infDTO);
		return new ResponseEntity<>(fetching, HttpStatus.OK);
	}
	
          
	
	 
	
       
}
