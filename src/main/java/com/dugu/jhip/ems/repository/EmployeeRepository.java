package com.dugu.jhip.ems.repository;

import com.dugu.jhip.ems.domain.Employee;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
