package respository;

import entity.Employee;
import helper.GenericModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static List<Employee> list = new ArrayList<>();
    private GenericModel<Employee> genericModel ;

    public EmployeeRepository(){
        this.genericModel = new GenericModel<>(Employee.class);
    }
    public boolean save(Employee employee) {
        genericModel.save(employee);
        return true;
    }

    public List<Employee> findAll() {
        return genericModel.findAll();
    }
}
