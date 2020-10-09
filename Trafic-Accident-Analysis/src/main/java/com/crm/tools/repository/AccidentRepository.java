package com.crm.tools.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.tools.model.Accident;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Long> {

}
