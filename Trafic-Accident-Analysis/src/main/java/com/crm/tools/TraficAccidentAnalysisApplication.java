package com.crm.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crm.tools.model.Accident;
import com.crm.tools.model.Motorist;
import com.crm.tools.model.Vehicle;
import com.crm.tools.repository.AccidentRepository;
import com.crm.tools.repository.MotoristRepository;
import com.crm.tools.repository.VehicleRepository;

@SpringBootApplication
public class TraficAccidentAnalysisApplication implements CommandLineRunner {

	@Autowired
	AccidentRepository accRepo;
	
	@Autowired
	MotoristRepository motRepo;
	
	@Autowired
	VehicleRepository vehRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TraficAccidentAnalysisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Accident acc=new Accident();
		acc.setAddress("Addis Ababa");
	
		this.accRepo.save(acc);
				
		Vehicle veh=new Vehicle();
		veh.setColor("Black");
		veh.setModel("Vols");
		veh.setVehicleIdentification("kjfdhkjdfdjh");
		veh.setMake("helodkhsfk");
	    veh.setAccident(acc);
		this.vehRepo.save(veh);
		
		Motorist mot=new Motorist();
		mot.setFirstName("Derbew");
		mot.setLastName("Felasman");
		mot.setAge(30);
		mot.setDriverLicense("hfjhjgdhfh");
		mot.setVehicle(veh);
		this.motRepo.save(mot);
		
		
	}

}
