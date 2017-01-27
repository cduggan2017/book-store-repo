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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManager() {
		return Manager;
	}

	public void setManager(String manager) {
		Manager = manager;
	}

	public String getNumberOfFloors() {
		return NumberOfFloors;
	}

	public void setNumberOfFloors(String numberOfFloors) {
		NumberOfFloors = numberOfFloors;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", location=" + location + ", Manager=" + Manager
				+ ", NumberOfFloors=" + NumberOfFloors + "]";
	}
	
	
	
}