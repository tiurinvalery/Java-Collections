package com.tiurinvalery;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestCustomArrayList {

    @Test
    public void testCreateCustomArray() {
        List<String> names = new CustomArrayList<>();
        assertNotNull(names);
    }

    @Test
    public void testCreateCustomArrayWithSpecifiedSize() {
        List<String> names = new CustomArrayList<>(10);
        assertNotNull(names);
    }

    @Test
    public void testAddObjectToCustomArrayList() {
        List<String> names = new CustomArrayList<>();

        names.add("Anything");

        assertEquals(1, names.size());
    }

    @Test
    public void testAddObjectExactlyTheSameToSpecified() {
        List<String> names = new CustomArrayList<>();
        String name = "First name";

        names.add(name);

        assertTrue(names.contains(name));
    }

    @Test
    public void testRemoveObject() {
        List<String> names = new CustomArrayList<>();
        String firstName = "Carl";
        String secondName = "Fedor";
        String thirdName = "Anton";

        names.add(firstName);
        names.add(secondName);
        names.add(thirdName);

        names.remove(secondName);

        assertTrue(names.contains(firstName));
        assertTrue(names.contains(thirdName));
        assertFalse(names.contains(secondName));
        assertEquals(2, names.size());
    }


}
