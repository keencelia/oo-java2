package mini.java.basic.arrays2;

import java.util.Arrays;

public class PasswordGroup implements Nameable {

    private Password[] passwords;
    private String name;

    public PasswordGroup(Password... passwords) {
        this.passwords = passwords;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     * @param password
     * @return
     */
    public boolean check(String name, Object password) {
        if (this.passwords == null)
            return false;
        for(Password p: passwords) {
            if (p.getName() == name) { // includes null
                return p.check(password);
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "name='" + this.name + "', "
                + "passwords=" + Arrays.toString(passwords) + "}";
    }
}
