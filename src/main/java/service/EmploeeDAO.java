package service;

import model.Employee;

import java.util.List;

public interface EmploeeDAO {

    Integer add(Employee employee);

    Employee getById(int id);

    List<Employee> getAllEmployee();

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(Employee employee);
}
