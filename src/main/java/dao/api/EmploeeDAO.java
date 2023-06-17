package dao.api;

import model.Employee;

import java.util.List;

public interface EmploeeDAO {

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
