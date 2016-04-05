package br.com.eduardo.frameworks.test.spring.data.repositories;


import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import br.com.eduardo.frameworks.spring.data.repositories.IStaffRepository;
import br.com.eduardo.frameworks.test.spring.data.AbstractSpringDataTest;

import br.com.eduardo.frameworks.spring.data.entities.StaffEntity;


public class StaffRepositoryTest extends AbstractSpringDataTest{
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Inject
	private IStaffRepository istaffRepository;
	
	@Test	
	
	public void testStaffList(){
		List<StaffEntity>staff = this.istaffRepository.findAll();
		this.logger.debug(staff);
	}
	
	
	@Test	
	public void testAdd(){
		StaffEntity user = new StaffEntity();
		
		user.setFirst_name("Luciana");
		user.setLast_name("Rodrigues");
		user.setEmail("@ana.com");
		user.setStore_id(1);
		user.setActive(false);
		user.setUsername("luciana");
		user.setPassword("123");		
		user.setLast_update(new Date());
		user = this.istaffRepository.save(user);
		this.logger.debug(user);
		
	}
	
	
	
	@Test
	public void deletar(){
		
		
		StaffEntity u1 = this.istaffRepository.findByFirstName("Lucas");
		this.istaffRepository.delete(u1);
	}	
	
}
