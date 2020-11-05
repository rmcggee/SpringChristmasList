package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ChristmasListContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String desiredPresent;
	private String relationship;
	@Autowired
	private Address address;

	public ChristmasListContact() {
		super();
	}

	public ChristmasListContact(String name) {
		this.name = name;
	}

	public ChristmasListContact(String name, String desiredPresent, String relationship) {
		this.name = name;
		this.desiredPresent = desiredPresent;
		this.relationship = relationship;
	}

	public ChristmasListContact(int id, String name, String phone, String relationship) {
		this.id = id;
		this.name = name;
		this.desiredPresent = desiredPresent;
		this.relationship = relationship;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesiredPresent() {
		return desiredPresent;
	}

	public void setDesiredPresent(String desiredPresent) {
		this.desiredPresent = desiredPresent;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", desiredPresent=" + desiredPresent + ", relationship=" + relationship
				+ ", address=" + address + "]";
	}

}