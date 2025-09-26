package be.ecam.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void nullMiddleNameShouldBeIgnored() {
        NameFormatter.Person p = new NameFormatter.Person("John", null, "Doe");
        assertEquals("John Doe", NameFormatter.displayName(p));  // added - to return once and solve the middle name issue
    }

    @Test
    void emptyMiddleNameShouldBeIgnored() {
        NameFormatter.Person p = new NameFormatter.Person("John", "", "Doe");
        assertEquals("John Doe", NameFormatter.displayName(p));
    }
}
