/**
 * 
 */
package ar.edu.um.programacion2.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.um.programacion2.backend.model.Employee;

/**
 * @author daniel
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
