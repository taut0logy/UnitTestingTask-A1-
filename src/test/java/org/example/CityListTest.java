package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    @Test
    void testDelete() {
        CityList cityList = new CityList();
        City city = new City("Khulna", "Telegati");
        cityList.add(city);
        cityList.deleteCity(city);
        assertEquals(0, cityList.getCities("city").size());
    }

    @Test
    void testDeleteException() {
        CityList cityList = new CityList();
        City city = new City("Khulna", "Telegati");
        assertThrows(IllegalArgumentException.class, () -> cityList.deleteCity(city));
    }

    @Test
    void testCount() {
        CityList cityList = new CityList();
        City city = new City("Khulna", "Telegati");
        cityList.add(city);
        City city2= new City("Dhaka", "Mirpur");
        cityList.add(city2);
        assertEquals(2, cityList.getCities("city").size());
    }

    @Test
    void testSort() {
        CityList cityList = new CityList();
        City city = new City("Khulna", "Telegati");
        cityList.add(city);
        City city2= new City("Dhaka", "Zurain");
        cityList.add(city2);
        city=cityList.getCities("city").get(0);
        city2=cityList.getCities("province").get(0);
        assertTrue(city.getCityName().equals("Dhaka") && city2.getCityName().equals("Khulna"));
    }
}