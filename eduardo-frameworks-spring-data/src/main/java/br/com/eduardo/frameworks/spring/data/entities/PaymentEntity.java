package br.com.eduardo.frameworks.spring.data.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.eduardo.frameworks.spring.data.utils.BaseEntities;


@Entity 
@Table(name = "payment") 							
@AttributeOverride(name = "id", column = @Column(name = "payment_id") )

public class PaymentEntity extends BaseEntities<Long> {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "customer_id",nullable = false, unique = false)
	private Integer customer_id;
	
	@Column(name = "staff_id",nullable = false, unique = false)
	private Integer staff_id;
	
	@Column(name = "rental_id",nullable = false, unique = false)
	private Integer rental_id;
	
	@Column(name = "amount",nullable = false, unique = false)
	private Double amount;
	
	public PaymentEntity() {
		// TODO Auto-generated constructor stub
	}

	public PaymentEntity(Integer customer_id, Integer staff_id, Integer rental_id, Double amount) {
		super();
		this.customer_id = customer_id;
		this.staff_id = staff_id;
		this.rental_id = rental_id;
		this.amount = amount;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public Integer getRental_id() {
		return rental_id;
	}

	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	

}
