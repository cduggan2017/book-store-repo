package Bookstore.Bookstore1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderLines {
	
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column (length = 50)
	protected String Name;
	
	@Column (length = 50)
	protected String Items;
	
	@Column (length = 50)
	protected Long OrderIDs;
	
	@Column (length = 50)
	protected String SalesPerson;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getItems() {
		return Items;
	}

	public void setItems(String items) {
		Items = items;
	}

	public Long getOrderIDs() {
		return OrderIDs;
	}

	public void setOrderIDs(Long orderIDs) {
		OrderIDs = orderIDs;
	}

	public String getSalesPerson() {
		return SalesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		SalesPerson = salesPerson;
	}


}
