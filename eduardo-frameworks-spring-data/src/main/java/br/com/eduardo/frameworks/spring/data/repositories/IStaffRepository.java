package br.com.eduardo.frameworks.spring.data.repositories;

import org.springframework.core.serializer.support.SerializationFailedException;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import br.com.eduardo.frameworks.spring.data.entities.StaffEntity;


public interface IStaffRepository extends JpaRepository<StaffEntity, Long>{
	
	
	
	
	
	//para Deletar
	
	@Query("select u from StaffEntity u where u.first_name = ?1")
	StaffEntity findByFirstName(String first);
	
	
	//@Modifying
	
	//@Query("update u StaffEntity u sete");

}

