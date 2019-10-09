/**
 * 
 */
package ar.edu.um.programacion2.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.programacion2.backend.model.Employee;
import ar.edu.um.programacion2.backend.service.EmployeeService;

/**
 * @author daniel
 *
 */
@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> findAll( ) {
		return new ResponseEntity<List<Employee>>(service.findAll(), HttpStatus.OK);
	}
}
