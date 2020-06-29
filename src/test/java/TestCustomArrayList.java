
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

    @Test(expected = CustomIndexOfBoundException.class)
    public void testCheckThatInitialSizeValidated() {
        List<String> names = new CustomArrayList<>(-1);
    }

    @Test
    public void testCheckThatInitialSizeValidatedForZeroVal() {
        List<String> names = new CustomArrayList<>(0);
    }

    @Test(expected = CustomNullPointerException.class)
    public void testNotPossibleToAddNull() {
        List<String> names = new CustomArrayList<>();
        names.add(null);
    }

    @Test(expected = CustomNullPointerException.class)
    public void testNotPossibleRemoveNull() {
        List<String> names = new CustomArrayList<>();
        names.remove(null);
    }

    @Test(expected = CustomNullPointerException.class)
    public void testNotPossibleToVerifyContainsForNull() {
        List<String> names = new CustomArrayList<>();
        names.contains(null);
    }


}
