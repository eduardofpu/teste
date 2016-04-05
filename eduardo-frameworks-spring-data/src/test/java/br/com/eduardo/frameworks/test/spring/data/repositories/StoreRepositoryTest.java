package br.com.eduardo.frameworks.test.spring.data.repositories;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import br.com.eduardo.frameworks.spring.data.repositories.IStoreRepository;
import br.com.eduardo.frameworks.test.spring.data.AbstractSpringDataTest;

import br.com.eduardo.frameworks.spring.data.entities.StoreEntity;

public class StoreRepositoryTest extends AbstractSpringDataTest{

	private Logger logger = Logger.getLogger(this.getClass());
	
	
	@Inject
	private IStoreRepository istoreRepository;
	
	@Test	
	
	public void testStoreList(){
		List<StoreEntity>store = this.istoreRepository.findAll();
		this.logger.debug(store);
	}
	
	
	@Test	
	public void testAdd(){
		StoreEntity user = new StoreEntity();
		
		
		user.setLast_update(new Date());
		
		user = this.istoreRepository.save(user);
		this.logger.debug(user);
	}
	
	
	
	}
