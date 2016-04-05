package br.com.eduardo.frameworks.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import br.com.eduardo.frameworks.spring.data.entities.RentalEntity;


public interface IRentalRepository extends JpaRepository<RentalEntity, Long>{

	
	@Query("select u from RentalEntity u where u.customer_id = ?1")
	RentalEntity findByCostomer(Integer c);
	
}
