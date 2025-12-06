package com.vechile.vechile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechile.vechile.DTO.OwnerDTO;
import com.vechile.vechile.Service.OwnerService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
@RestController
@RequestMapping("/owner")
public class OwnerController {
	
	@Autowired
   private OwnerService ownerService;
	
	
	//build a rest api create an owner 
	@PostMapping
	 public ResponseEntity<OwnerDTO>createownerDTO(@RequestBody OwnerDTO dto ){
		  OwnerDTO create=ownerService.createOwner(dto);
		  return new ResponseEntity<>(create,HttpStatus.OK);
	}
	
	//build a owner Id 
	@GetMapping("{id}")
	public ResponseEntity<OwnerDTO>getOwnerId(@PathVariable("id") Long ownerId ){
		OwnerDTO getId=ownerService.getById(ownerId);
		return new ResponseEntity<>(getId,HttpStatus.OK);
			
	}
	
	//get All Owner
	    @GetMapping
	    public ResponseEntity<List<OwnerDTO>>getAll(){
	    	List<OwnerDTO>getALL=ownerService.getAllEmployee();
	         return new ResponseEntity<>(getALL,HttpStatus.OK);
	    }
	    
	    //update Owner 
	    @PutMapping("/{id}")
	    public ResponseEntity<OwnerDTO>updateOwner(@PathVariable("id") Long ownerId ,@RequestBody OwnerDTO ownerdto){
	    	OwnerDTO ownerid=ownerService.updateOwner(ownerId, ownerdto);
	    	return new ResponseEntity<>(ownerid,HttpStatus.OK);
	    	
	    	
	    }
	     //delete mapping or ID delete
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String>deleteOwnerId(@PathVariable("id") Long ownerId){
                     ownerService.deleteByOwnerId(ownerId);
                     return ResponseEntity.ok("This Id was deleted succesfully");
	    }
	    
	
	
}
