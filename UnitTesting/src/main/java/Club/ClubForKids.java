package Club;

import java.util.ArrayList;
import java.util.List;

public class ClubForKids extends Club{
    List<Person> kidsInClub = new ArrayList<>();

    public void enter(Person person) {
       kidsInClub.add(person);
    }
}
