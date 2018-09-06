package pareis.spring.example.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pareis.spring.example.spring.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}