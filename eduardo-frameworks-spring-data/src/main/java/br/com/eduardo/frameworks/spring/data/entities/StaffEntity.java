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
@Table(name = "staff") 							
@AttributeOverride(name = "id", column = @Column(name = "staff_id") )

public class StaffEntity extends BaseEntities<Long>{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "first_name", length = 45, nullable = false, unique = false)
	private String first_name;
	
	@Column(name = "last_name", length = 45, nullable = false, unique = false)
	private String last_name;
	
	@Column(name = "email", length = 50, nullable = false, unique = false)
	private String email;
	
	@Column(name = "store_id",nullable = false, unique = false)
	private Integer store_id;
	
	@Column(name = "active",nullable = false, unique = false)
	private Boolean active;
	
	
	@Column(name = "username", length = 16, nullable = false, unique = false)
	private String username;
	
	@Column(name = "password", length = 40, nullable = false, unique = false)
	private String password;
	
	@Column(name = "last_update", nullable = false, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP) // Para converter a data	
	private Date last_update;
	
	
	public StaffEntity(){
		
	}


	public StaffEntity(String first_name, String last_name, String email, Integer store_id, Boolean active,
			String username, String password, Date last_update) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.store_id = store_id;
		this.active = active;
		this.username = username;
		this.password = password;
		this.last_update = last_update;
	}





	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getStore_id() {
		return store_id;
	}


	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getLast_update() {
		return last_update;
	}


	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	

}
