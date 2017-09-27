package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void before() {
        user = new User(35, "Name", "Familyname");
    }

    @Test
    public void testFullNameAnglosaxon() {
        assertEquals("Familyname Name", user.fullNameAnglosaxon());
    }

}
