package br.com.eduardo.frameworks.test.spring.data;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={
		"/ctx-eduardo-frameworks-spring-data.xml"})

//  Carrega automaticamente tudo que esta no banco 
public class AbstractSpringDataTest {
	
	

}
