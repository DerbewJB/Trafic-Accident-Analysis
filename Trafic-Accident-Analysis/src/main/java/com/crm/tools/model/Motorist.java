package com.crm.tools.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Motorist {
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;
	private String lastName;
	private String driverLicense;
	private int age;
	
	@ManyToOne
	@JsonIgnore
	private Vehicle vehicle;
	
	@OneToMany(mappedBy="motorist")
	private Set<Accident> accident;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Set<Accident> getAccident() {
		return accident;
	}
	public void setAccident(Set<Accident> accident) {
		this.accident = accident;
	}

}
