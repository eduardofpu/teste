package br.com.eduardo.frameworks.test.spring.data.repositories;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.List;
import br.com.eduardo.frameworks.spring.data.repositories.IPaymentRepository;
import br.com.eduardo.frameworks.test.spring.data.AbstractSpringDataTest;
import br.com.eduardo.frameworks.spring.data.entities.PaymentEntity;



public class PaymentRepositoryTest extends AbstractSpringDataTest{

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Inject
	private IPaymentRepository ipaymentRepository;
	
	@Test	
	
	public void testPaymentList(){
		List<PaymentEntity>payment = this.ipaymentRepository.findAll();
		this.logger.debug(payment);
	}
	
	@Test	
	public void testAdd(){
		PaymentEntity user = new PaymentEntity();
		
		user.setCustomer_id(1);
		user.setStaff_id(1);
		user.setRental_id(1);
		user.setAmount(2.55);		
		user = this.ipaymentRepository.save(user);
		this.logger.debug(user);
	}
	
	@Test
	public void deletar(){
		PaymentEntity p = this.ipaymentRepository.findByAmont(2.55);
		this.ipaymentRepository.delete(p);
	}
}
