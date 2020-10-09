package com.crm.tools.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private long id;
	
	private String make;
	private String model;
	private String color;
	private String vehicleIdentification;
	
	@OneToMany(mappedBy="vehicle")
	private Set<Motorist> motorist;
	
	@ManyToOne
	@JsonIgnore
	private Accident accident;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVehicleIdentification() {
		return vehicleIdentification;
	}
	public void setVehicleIdentification(String vehicleIdentification) {
		this.vehicleIdentification = vehicleIdentification;
	}
	public Set<Motorist> getMotorist() {
		return motorist;
	}
	public void setMotorist(Set<Motorist> motorist) {
		this.motorist = motorist;
	}
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	

}
