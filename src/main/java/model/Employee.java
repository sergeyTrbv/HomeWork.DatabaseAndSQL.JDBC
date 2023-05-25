package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Employee {

    private int id;
    private String first_name;
    private String last_name;
    private String gender;
    private int age;
    private City city;

    public Employee(int id, String first_name, String last_name, String gender, int age, City city) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee(String first_name, String last_name, String gender, int age, City city) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee() {

    }

//    public static Employee create(ResultSet resultSet) throws SQLException {
//        Employee employee = new Employee();
//        employee.setId(resultSet.getInt("id"));
//        employee.setfirst_name(resultSet.getString("first_name"));
//        employee.setlast_name(resultSet.getString("last_name"));
//        employee.setGender(resultSet.getString("gender"));
//        employee.setAge(resultSet.getInt("age"));
//        employee.setcity_id(resultSet.getInt("city_id"));
//        return employee;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && city == employee.city && first_name.equals(employee.first_name) && last_name.equals(employee.last_name) && gender.equals(employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, gender, age, city);
    }

    @Override
    public String toString() {
        return "id=" + id + ", first_name='" + first_name +
                ", last_name='" + last_name + ", gender='" + gender +
                ", age=" + age + ", city=" + city;
    }
}
