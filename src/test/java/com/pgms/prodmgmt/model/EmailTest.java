package com.pgms.prodmgmt.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            Email email = new Email("acccc");
        });
    }

    @Test
    public void testValidEmail() {
        Email email = new Email("hello@test.com");
        assertTrue(email.getAddress().equals("hello@test.com"));
    }

    @Test
    public void testEqEmail() {
        Email email1 = new Email("hello@gmail.com");
        Email email2 = new Email("hello@gmail.com");
        assertEquals(email1, email2);
    }
}
