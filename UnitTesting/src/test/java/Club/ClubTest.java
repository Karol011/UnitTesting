package Club;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ClubTest {
    private Club club;


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup() {
        club = new Club();
    }

    @Test(expected = NoKidException.class)
    public void enterTestKid() {
        club.enter(new Person("bla", "blaa", 16));
    }



    @Test
    public void testAge17() {
        exception.expect(NoKidException.class);
        exception.expectMessage("No kids allowed");
        //given
        Person person = new Person("kamil", "kamilkksyyy", 17);

        //when
        club.enter(person);

        //then
        club.enter(person);

    }

}