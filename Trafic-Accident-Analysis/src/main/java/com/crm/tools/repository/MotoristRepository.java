package com.crm.tools.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.tools.model.Motorist;
@Repository
public interface MotoristRepository extends JpaRepository<Motorist, Long> {

}
