package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void testEquals() {
        Item item1 = new Item("Laptop", 1500.00, "12345");
        Item item2 = new Item("Laptop", 1500.00, "12345");
        Item item3 = new Item("Smartphone", 800.00, "67890");

        assertTrue(item1.equals(item2), "Items should be equal with same codigo");
        assertFalse(item1.equals(item3), "Items should not be equal with different codigo");
    }

    @Test
    void testToString() {
        Item item = new Item("Laptop", 1500.00, "12345");
        String expectedString = "Item{nombre='Laptop', precio=1500.0, codigo='12345'}";
        assertEquals(expectedString, item.toString(), "toString should return the correct string");
    }
}

