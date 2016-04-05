package br.com.eduardo.frameworks.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.eduardo.frameworks.spring.data.entities.PaymentEntity;
import br.com.eduardo.frameworks.spring.data.entities.StaffEntity;


public interface IPaymentRepository extends JpaRepository<PaymentEntity, Long>{

	
	@Query("select u from PaymentEntity u where u.amount = ?1")
	PaymentEntity findByAmont(double d);
}
