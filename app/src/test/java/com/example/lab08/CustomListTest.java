package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    
    @Test
    public void testDeleteCity()
    {
        CustomList list = new CustomList();
        City isloo = new City("isloo", "ICT");
        list.addCity(isloo);
        list.deleteCity(isloo);
        assertFalse(list.hasCity(isloo));
        
    }

    @Test
    public void testCountCities()
    {
        CustomList list = new CustomList();
        City lahore = new City("lahore", "Punjab");
        list.addCity(lahore);

        int count = list.countCities();
        assertEquals(1, count);
    }


}
