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
@Table(name = "rental") 							
@AttributeOverride(name = "id", column = @Column(name = "rental_id") )

public class RentalEntity extends BaseEntities<Long>{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "rental_date", nullable = false, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP) // Para converter a data	
	private Date rental_date;
	
	@Column(name = "customer_id",nullable = false, unique = false)
	private Integer customer_id;
	
	@Column(name = "return_date", nullable = false, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP) // Para converter a data	
	private Date return_date;
	
	
	@Column(name = "staff_id",nullable = false, unique = false)
	private Integer staff_id;
	
	@Column(name = "last_update", nullable = false, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP) // Para converter a data	
	private Date last_update;
	
	public RentalEntity() {
		// TODO Auto-generated constructor stub
	}

	public RentalEntity(Date rental_date, Integer customer_id, Date return_date, Integer staff_id, Date last_update) {
		super();
		this.rental_date = rental_date;
		this.customer_id = customer_id;
		this.return_date = return_date;
		this.staff_id = staff_id;
		this.last_update = last_update;
	}

	public Date getRental_date() {
		return rental_date;
	}

	public void setRental_date(Date rental_date) {
		this.rental_date = rental_date;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	

}
