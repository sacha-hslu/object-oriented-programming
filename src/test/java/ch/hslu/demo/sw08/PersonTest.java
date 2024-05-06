package ch.hslu.demo.sw08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreatePerson() {
        Person person = new Person(1, "prename", "name");

        assertEquals(1, person.getId());
        assertEquals("prename", person.getPrename());
        assertEquals("name", person.getName());
    }

    @Test
    void equals_null_notEqual() {
        Person person = new Person(1, "prename", "name");

        assertNotEquals(null, person);
    }

}