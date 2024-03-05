package org.example;

/**
 * This is a class that keeps track of a city object
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This is the constructor for the city object
     * @param city
     *      This is the name of the city
     * @param province
     *      This is the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }


    /**
     * This is the getter for the city name
     * @return
     *      Return the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This is the getter for the province name
     * @return
     *      Return the name of the province
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * This is method to compare two city objects
     * @param city
     *      This is the name of the city to compare
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
