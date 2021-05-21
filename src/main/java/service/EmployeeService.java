package service;

import entity.Employee;
import respository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }
    public boolean create(Employee  obj) {
        // mã hoá password
        return employeeRepository.save(obj);
    }
    public List<Employee> getList(){
        return employeeRepository.findAll();
    }
}
