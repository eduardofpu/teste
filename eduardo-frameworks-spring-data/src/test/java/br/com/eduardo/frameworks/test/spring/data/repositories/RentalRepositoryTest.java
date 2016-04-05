package br.com.eduardo.frameworks.test.spring.data.repositories;


import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import br.com.eduardo.frameworks.spring.data.repositories.IRentalRepository;
import br.com.eduardo.frameworks.test.spring.data.AbstractSpringDataTest;
import br.com.eduardo.frameworks.spring.data.entities.RentalEntity;


public class RentalRepositoryTest extends AbstractSpringDataTest{

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Inject
	private IRentalRepository irentalRepository;
	
	@Test	
	
	public void testRentalList(){
		List<RentalEntity>rental = this.irentalRepository.findAll();
		this.logger.debug(rental);
	}
	
	@Test	
	public void testAdd(){
		RentalEntity user = new RentalEntity();
		
		user.setRental_date(new Date());
		user.setCustomer_id(1);
		user.setReturn_date(new Date());
		user.setStaff_id(1);
		user.setLast_update(new Date());
		user = this.irentalRepository.save(user);
		this.logger.debug(user);
	}
	@Test
	public void deletar(){
		RentalEntity r = this.irentalRepository.findByCostomer(1);
		this.irentalRepository.delete(r);
	}
}
