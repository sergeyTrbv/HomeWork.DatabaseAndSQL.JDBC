package dao.api;

import model.City;

import java.util.List;

public interface CityDAO {

    City add(City city);

    City getById(int id);

    List<City> getAllCity();

    void updateCity(City city);

    void deleteCity(City city);
}
