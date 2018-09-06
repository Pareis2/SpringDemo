package pareis.spring.example.spring.demo.controller;
import pareis.spring.example.spring.demo.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Long;
import java.lang.*;

public class EmpStub {
    private static Map<Long, Employee> staff = new HashMap<Long, Employee>();
    private static Long idIndex = 3L;

    static{
        Employee a = new Employee(1L, "Stan", "Smith", 38);
        staff.put(1L, a);
        Employee b = new Employee(2L, "Tea", "Cup", 45);
        staff.put(2L, b);
        Employee c = new Employee(3L, "Coffee", "Mug", 50);
        staff.put(3L,c);
    }

    public static List<Employee> list(){

        return new ArrayList<Employee>(staff.values());
    }

    public static Employee create(Employee staff){

        idIndex += idIndex;
        staff.setId(idIndex);
        staff.put(idIndex, staff);
        return staff;

    }

    public static Employee get (Long id){
        return staff.get(id);
    }

    public static Employee update(Long id, Employee staff){
        staff.put(id, staff);
        return staff;
    }

    public static Employee delete(Long id){
        return staff.remove(id);
    }

}
