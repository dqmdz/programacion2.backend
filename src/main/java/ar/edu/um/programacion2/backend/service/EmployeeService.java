/**
 * 
 */
package ar.edu.um.programacion2.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.programacion2.backend.model.Employee;
import ar.edu.um.programacion2.backend.repository.EmployeeRepository;

/**
 * @author daniel
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public List<Employee> findAll() {
		return repository.findAll();
	}
}
