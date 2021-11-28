package com.example.simpleparadox.listycity;

import androidx.core.widget.TextViewCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Return the size of the city list
     * @return
     * size of city list
     */


    public int countCities(){
        return cities.size();
    }

    /**
     * delete a specific city object from the list
     * get a city object - if exists delete it - if not throw exception
     *
     * @param
     *  city
     * @return
     * none
     *
     */

    void deleteCity(City city){
        if (cities.contains(city)) {
            cities.remove(city);
        }else{
            throw  new NoSuchElementException();
        }
    }

}
