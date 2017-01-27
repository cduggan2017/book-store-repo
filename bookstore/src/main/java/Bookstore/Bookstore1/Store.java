package Bookstore.Bookstore1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Store{
	
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column (length = 50)
	protected String storeName;
	
	@Column (length = 50)
	protected String location;
	
	@Column (length = 50)
	protected String Manager;
	
	@Column (length = 50)
	protected String NumberOfFloors;
}