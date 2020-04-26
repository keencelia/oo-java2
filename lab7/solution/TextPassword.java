package mini.java.basic.arrays2;

import java.util.Objects;

public class TextPassword extends Password {

    public TextPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean check(Object password) {
        if (!(password instanceof String))
            return false;
        return (this.password.equals(password));
    }


}
