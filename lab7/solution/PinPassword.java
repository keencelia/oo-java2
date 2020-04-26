package mini.java.basic.arrays2;

import java.util.Arrays;

public class PinPassword extends Password {

    public PinPassword(int...pin) {
        // if (pin.length < 4) {
        //     throw new Exception ("Pin is too short");
        // }
        // password = Arrays.copyOfRange(pin, 0, 4);
        password = Arrays.copyOf(pin, pin.length);
    }

    @Override
    public boolean check(Object password) {

        if(!(password instanceof int []))
            return false;

        return Arrays.equals((int [])this.password, (int [])password);
    }

}
