package com.vechile.vechile.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vechile.Mapper.OwnerMapping;
import com.vechile.vechile.DTO.OwnerDTO;
import com.vechile.vechile.Entity.Owner;
import com.vechile.vechile.Exception.ExceptionHandling;
import com.vechile.vechile.Repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	
	private OwnerRepository ownerRepository; 
	 
	@Override
	public OwnerDTO createOwner(OwnerDTO ownerDTO) {
		Owner owner=OwnerMapping.mapToOwner(ownerDTO);
		         owner=ownerRepository.save(owner);
				return OwnerMapping.mapToOwnerDTO(owner);
				                                          }

	@Override
	public OwnerDTO getById(Long id) {
		Owner owner=ownerRepository.findById(id).orElseThrow(()-> new ExceptionHandling("This id not valid"+id));
		return OwnerMapping.mapToOwnerDTO(owner);
	}

	@Override
	public List<OwnerDTO> getAllEmployee() {
		 List<Owner> owner=ownerRepository.findAll();
		return owner.stream().map((owners) ->OwnerMapping.mapToOwnerDTO(owners)).collect(Collectors.toList());
	}

	@Override
	public OwnerDTO updateOwner(Long id, OwnerDTO updateOwner) {
		Owner owner=ownerRepository.findById(id).orElseThrow(()-> new ExceptionHandling("This Id not in database"+id));
		owner.setName(updateOwner.getName());
		owner.setEmail(updateOwner.getEmail());
		owner.setPassword(updateOwner.getPassword());
		owner.setRcBook(updateOwner.getRcBook());
		owner.setDriverMonthSalary(updateOwner.getDriverMonthSalary());
		owner.setOppainment(updateOwner.getOppainment());
		Owner updatedOwner=ownerRepository.save(owner);
		return OwnerMapping.mapToOwnerDTO(updatedOwner);
	}

	@Override
	public void deleteByOwnerId(Long ownerId) {
		Owner owner=ownerRepository.findById(ownerId).orElseThrow(()-> new ExceptionHandling("This id not valid"+ ownerId));
		     ownerRepository.deleteById(ownerId);
		
	}

}
