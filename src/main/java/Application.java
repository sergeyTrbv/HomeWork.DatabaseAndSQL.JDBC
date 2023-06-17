import dao.api.CityDAO;
import dao.api.EmploeeDAO;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "141298Skypro";
        final String url = "jdbc:postgresql://localhost:5432/homework";


        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {

            statement.setInt(1, 2);
            final ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String first_nameEmployee = "First name: " + resultSet.getString("first_name");
                String last_nameEmployee = "Last name: " + resultSet.getString("last_name");
                String genderOfEmployee = "gender: " + resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt(5);

//                System.out.println(first_nameEmployee);
//                System.out.println(last_nameEmployee);
//                System.out.println(genderOfEmployee);
//                System.out.println("Age : " + ageOfEmployee);

            }

        }
        EmploeeDAO emploeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDaoImpl();

//        emploeeDAO.addEmployee(new Employee("Pavel", "Volya", "man", 15, new City("Penza")));

//        emploeeDAO.deleteEmployee(emploeeDAO.getEmployeeById(23));

//        emploeeDAO.addEmployee((new Employee("John", "Week", "man", 45, new City("New York"))));
//        emploeeDAO.addEmployee((new Employee("Piter", "Parker", "man", 22, cityDAO.getById(11))));

//        emploeeDAO.getEmployeeById(4);


    }
}