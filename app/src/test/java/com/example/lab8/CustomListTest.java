package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    public CustomList MockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        list.addCity(mockCity());
        return list;
    }

    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest(){
        CustomList list = MockCityList();
        City city =new City("Yellowknife", "NWT");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

}
