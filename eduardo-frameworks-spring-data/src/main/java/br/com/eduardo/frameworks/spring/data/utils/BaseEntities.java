package br.com.eduardo.frameworks.spring.data.utils;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

//guardando a classe abstrata  
//pode utilizar essa classe em outros projetos
// se eu tiver 10 entitadade elas estaram herdando o BaseEntities
// chave primaria <PK> tipo generico se é long ,int, String ou Char ...


public abstract class BaseEntities <PK extends Serializable>
extends AbstractPersistable <PK> implements Serializable {// chave primarias
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	
	public String toString(){
		
		 return ToStringBuilder.reflectionToString(this,
				 ToStringStyle.MULTI_LINE_STYLE);
	}
	
	
	@Override
	public boolean equals(Object obj){
		
		return EqualsBuilder.reflectionEquals(this,obj);
		
	}
	

}
