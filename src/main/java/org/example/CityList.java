package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @param parameter
     *     This is the parameter to sort the list by
     * @return
     *      Return the sorted list of cities according to the parameter
     */
    public List<City> getCities(String parameter) {
        List<City> cityList = cities;
        switch (parameter) {
            case "city":
                cityList.sort((c1, c2) -> c1.getCityName().compareTo(c2.getCityName()));
                break;
            case "province":
                cityList.sort((c1, c2) -> c1.getProvinceName().compareTo(c2.getProvinceName()));
                break;
            default:
                throw new IllegalArgumentException();
        }
        return cityList;
    }

    /**
     * This deletes a city from the list if that city exists, otherwise it throws an exception
     * @param city
     *      This is the city to delete
     */
    public void deleteCity(City city) throws IllegalArgumentException{
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns the number of cities in the list
     * @return
     *      Return the number of cities in the list
     */
    public int count() {
        return cities.size();
    }
}