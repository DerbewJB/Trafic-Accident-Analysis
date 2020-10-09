package com.crm.tools.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Accident {
	@Id
	@GeneratedValue
	private long id;
	
	private String address;
	
	@OneToMany(mappedBy="accident")
	private Set<Vehicle> vehicle;
	
	@ManyToOne
	@JsonIgnore
	private Motorist motorist;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public Motorist getMotorist() {
		return motorist;
	}
	public void setMotorist(Motorist motorist) {
		this.motorist = motorist;
	}
	

}
