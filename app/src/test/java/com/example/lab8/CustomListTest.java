package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /* get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plusone
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();

        list.addCity(new City("Estevan", "SK"));
        City city = new City("Estevan", "SK");
        assertEquals(true, list.has(city));
    }

    @Test
    void testDeleteCity(){
        list = MockCityList();
        City city = new City("Edmonton","Alberta");
        list.delete(city);
        assertEquals(false, list.has(city));

    }

    @Test
    void testCountCities() {
        list = MockCityList();
        assertEquals(0, list.countCities());
        City city = new City("Yellowknife", "Northwest Territories");
        list.addCity(city);
        assertEquals(1, list.countCities());
    }

}


