package Club;

import java.util.ArrayList;
import java.util.List;

public class Club {
    List<Person> personsInClub = new ArrayList<>();

    public void enter(Person person) {
        if (person.getAge() < 18) {
            throw new NoKidException("No kids allowed");
        } else {
            personsInClub.add(person);
        }
    }
}
