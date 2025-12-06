package com.vechile.vechile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vechile.vechile.Entity.Information;

@Repository
@Service
public interface InformationRepository extends JpaRepository<Information, Long> {
	
	

}
