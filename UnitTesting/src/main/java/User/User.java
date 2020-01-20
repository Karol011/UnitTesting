package User;

public class User {




    public boolean checkName(String name) {
        if (name.length() > 40 || name.length() < 3) {
            if (name.length() < 3) {
                throw new IllegalArgumentException("username is too short");
            } else {
                throw new IllegalArgumentException("username is too long");
            }
        }
        return true;
    }
}
