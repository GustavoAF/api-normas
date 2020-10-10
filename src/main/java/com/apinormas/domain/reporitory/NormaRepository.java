package com.apinormas.domain.reporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apinormas.domain.model.NormaEntity;

@Repository
public interface NormaRepository extends CrudRepository<NormaEntity, String>  {
	
	

}
