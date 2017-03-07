package model;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
public class UserTest {

    public static final String EXPECTED_FIRST_NAME = "Boob";
    public static final String EXPECTED_PASSWORD = "Nigger";
    public static final String EXPECTED_EMAIL = "gay_sex@gmail.com";

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Boob", "Nigger", "gay_sex@gmail.com");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test Completed");
    }

    @Test
    public void testUserDetails() throws Exception {
        Assert.assertEquals(EXPECTED_FIRST_NAME, user.getName());
        Assert.assertEquals(EXPECTED_PASSWORD, user.getPassword());
        Assert.assertEquals(EXPECTED_EMAIL, user.getEmail());

    }


}
