package br.com.eduardo.frameworks.spring.data.entities;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import br.com.eduardo.frameworks.spring.data.utils.BaseEntities;


@Entity 
@Table(name = "store") 							
@AttributeOverride(name = "id", column = @Column(name = "store_id") )

public class StoreEntity extends BaseEntities<Long>{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "last_update", nullable = false, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP) // Para converter a data
	private Date last_update;
	
	
public StoreEntity() {
	// TODO Auto-generated constructor stub
}


public StoreEntity(Date last_update) {
	super();
	this.last_update = last_update;
}


public Date getLast_update() {
	return last_update;
}


public void setLast_update(Date last_update) {
	this.last_update = last_update;
}



}
