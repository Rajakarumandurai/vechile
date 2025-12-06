package com.vechile.vechile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vechile.vechile.Entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
