package com.vechile.vechile.Service;




import java.util.List;

import com.vechile.vechile.DTO.OwnerDTO;


public interface OwnerService {
	OwnerDTO createOwner(OwnerDTO ownerDTO);
	OwnerDTO getById(Long id);
	List<OwnerDTO> getAllEmployee();
	OwnerDTO updateOwner(Long id, OwnerDTO updateOwner);
     void deleteByOwnerId(Long ownerId);
}
