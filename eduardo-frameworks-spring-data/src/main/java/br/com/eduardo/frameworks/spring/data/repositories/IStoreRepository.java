package br.com.eduardo.frameworks.spring.data.repositories;



import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.eduardo.frameworks.spring.data.entities.StoreEntity;



public interface IStoreRepository extends JpaRepository<StoreEntity, Long>{

	
	
	
	//@Query("select u from StoreEntity u where u.last_update = ?1")
	// StoreEntity findByStoreLastUpdate(Date date);
}
