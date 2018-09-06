package pareis.spring.example.spring.demo.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pareis.spring.example.spring.demo.model.Employee;
import pareis.spring.example.spring.demo.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmpController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "employee", method = RequestMethod.GET)
    public List<Employee> list()
    {
        //return EmpStub.list();
        return employeeRepository.findAll();
    }
    @RequestMapping(value = "employee", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee) {
        //return EmpStub.create(employee);
        return employeeRepository.saveAndFlush(employee);
    }
    @RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable Long id){
        //return  EmpStub.get(id);
        return employeeRepository.findOne(id);
    }
    @RequestMapping(value = "employee/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable Long id, @RequestBody Employee employee){
        //return EmpStub.update(id, employee);
        Employee existingEmployee = employeeRepository.findOne(id);
        BeanUtils.copyProperties(employee, existingEmployee);
        return employeeRepository.saveAndFlush(existingEmployee);

    }

    @RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
    public Employee delete(@PathVariable Long id){
        //return EmpStub.delete(id);
        Employee existingEmployee = employeeRepository.findOne(id);
        employeeRepository.delete(existingEmployee);
        return existingEmployee;

    }

}