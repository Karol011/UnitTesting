package User;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UserTest {
private User user;


@Rule
public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setup() {
        user = new User();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckNameShort() {
        user.checkName("ss");
    }

    @Test
    public void testCheckNameLong() {
        //given
        String userName = "asdfgfdgfdgfdgdfhsfgnfbljdshfdjvbhsdjvldsvhsdvlvkj";
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("name is too long");
        //when
        boolean result = user.checkName(userName);
        //then
        assertEquals(false,result);
    }
}