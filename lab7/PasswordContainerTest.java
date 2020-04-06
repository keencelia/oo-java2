package mini.java.basic.arrays.test;

import static org.junit.Assert.*;

public class PasswordContainerTest {
    /***
     * PinPassword i TextPassword - Implementacja, rozszerzenie klasy abstrakcyjnej, implementacja interfejsu
     *
     */

    /***
     * Prosty equals() - sprawdzenie dla identycznych, sprawdzenie konstruktorów
     * @difficulty 1
     */
    @org.junit.Test
    public void primitiveEqualsPinPasswordImpl() {
        Password pw1 = new PinPassword(1,2,3,4);
        int[] j = {1,2,3,4};
        Password pw2 = new PinPassword(j);
        assertFalse(pw1 == pw2);
    }

    /***
     * Prosty equals() - sprawdzenie dla identycznych
     * @difficulty 1
     */
    @org.junit.Test
    public void primitiveEqualsTextPasswordImpl() {
        Password pw1 = new TextPassword("AlaMaKota1234");
        Password pw2 = new TextPassword("AlaMaKota1234");
        assertFalse(pw1 == pw2);
    }

    /***
     * equals() - sprawdzenie dla identycznych, sprawdzenie konstruktorów
     * @difficulty 1
     */
    @org.junit.Test
    public void equalPinPasswordImpl() {
        Password pw1 = new PinPassword(1,2,3,4);
        int[] j = {1,2,3,4};
        Password pw2 = new PinPassword(j);
        assertTrue(pw1.equals(pw2));
    }

    /***
     * equals() - sprawdzenie dla identycznych, sprawdzenie konstruktorów
     * @difficulty 1
     */
    @org.junit.Test
    public void equalsTextPasswordImpl() {
        Password pw1 = new TextPassword("AlaMaKota1234");
        Password pw2 = new TextPassword("AlaMaKota1234");
        assertTrue(pw1.equals(pw2));
    }

    /***
     * Maskujący toString
     * @difficulty 1
     */
    @org.junit.Test
    public void toStringTextPasswordImpl() {
        Password pw1 = new TextPassword("AlaMaKota1234");
        Password pw2 = new TextPassword("36UK^%#IKVW&^$%BI#k76%I$^u7VIKB$&I#%");
        pw2.setName("Bank");
        assertTrue(pw1.toString().equals("TextPassword{password=****, name='null'}"));
        assertTrue(pw2.toString().equals("TextPassword{password=****, name='Bank'}"));
    }

    /***
     * Maskujący toString
     * @difficulty 1
     */
    @org.junit.Test
    public void toStringPinPasswordImpl() {
        Password pw1 = new PinPassword(1,2,3,4);
        int[] j = {1,2,3,4,5,6,7,8,9};
        Password pw2 = new PinPassword(j);
        pw2.setName("Karta");
        assertTrue(pw1.toString().equals("PinPassword{password=****, name='null'}"));
        assertTrue(pw2.toString().equals("PinPassword{password=****, name='Karta'}"));
    }

    /***
     * Implementacja interfejsu Nameable
     * @difficulty 1
     */
    @org.junit.Test
    public void nameablePinPasswordImplementation() {
        Password pw1 = new PinPassword(1,2,3,4);
        pw1.setName("Karta VISA");
        assertTrue(pw1.getName().equals("Karta VISA"));
    }

    /***
     * Implementacja interfejsu Nameable
     * @difficulty 2
     */
    @org.junit.Test
    public void nameableArrayPinPasswordImplementation() {
        Password pw1 = new PinPassword(1,2,3,4);
        Password pw2 = new TextPassword("AlaMaKota1234");
        pw1.setName("Karta VISA");
        pw2.setName("Konto w Banku");
        Nameable[] nameables = { pw1, pw2 };
        assertTrue(nameables[0].getName().equals("Karta VISA"));
        assertTrue(nameables[1].getName().equals("Konto w Banku"));
    }

    /***
     * Implementacja interfejsu Nameable
     * @difficulty 2
     */
    @org.junit.Test
    public void nameableArrayPinPasswordImplementationFalse() {
        Password pw1 = new PinPassword(1,2,3,4);
        Password pw2 = new TextPassword("AlaMaKota1234");
        pw1.setName("Karta MasterCard");
        pw2.setName("Konto w Innym Banku");
        Nameable[] nameables = { pw1, pw2 };
        assertFalse(nameables[0].getName().equals("Karta VISA"));
        assertFalse(nameables[1].getName().equals("Konto w Banku"));
        assertTrue(nameables[0].getName().equals("Karta MasterCard"));
        assertTrue(nameables[1].getName().equals("Konto w Innym Banku"));
    }

    /***
     * PasswordGroup - toString, equals, hashcode
     */

    /***
     * Implementacja klasy PasswordGroup - toString()
     * @difficulty 1
     */
    @org.junit.Test
    public void passwordGroupToString() {
        Password pw1 = new PinPassword(1,2,3,4);
        Password pw2 = new TextPassword("AlaMaKota1234");
        PasswordGroup passwordGroup = new PasswordGroup(pw1, pw2);
        assertTrue(passwordGroup.toString().equals("PasswordGroup{name='null', passwords=[PinPassword{password=****, name='null'}, TextPassword{password=****, name='null'}]}"));
    }
    /***
     * Implementacja klasy PasswordGroup - toString()
     * @difficulty 1
     */
    @org.junit.Test
    public void passwordGroupToString3Elemetns() {
        Password pw1 = new PinPassword(1,2,3,4);
        Password pw2 = new TextPassword("AlaMaKota1234");
        Password pw3 = new TextPassword("36UK^%#IKVW&^$%BI#k76%I$^u7VIKB$&I#%");
        PasswordGroup passwordGroup = new PasswordGroup(pw1, pw2, pw3);
        assertTrue(passwordGroup.toString().equals("PasswordGroup{name='null', passwords=[PinPassword{password=****, name='null'}, TextPassword{password=****, name='null'}, TextPassword{password=****, name='null'}]}"));
    }
    /***
     * Implementacja klasy PasswordGroup - implementacja interfejsu Nameable
     * @difficulty 2
     */
    @org.junit.Test
    public void nameableArrayPasswordsAndGroupImplementationFalse() {
        Password pw1 = new PinPassword(1,2,3,4);
        Password pw2 = new TextPassword("AlaMaKota1234");
        Password pw3 = new TextPassword("36UK^%#IKVW&^$%BI#k76%I$^u7VIKB$&I#%");
        pw1.setName("Karta MasterCard");
        pw2.setName("Konto w Innym Banku");
        pw2.setName("Inne");
        PasswordGroup passwordGroup = new PasswordGroup(pw2, pw3);
        passwordGroup.setName("Grupa");
        Nameable[] nameables = { pw1, passwordGroup };
        assertFalse(nameables[0].getName().equals("Karta VISA"));
        assertFalse(nameables[1].getName().equals("Coś!"));
        assertTrue(nameables[0].getName().equals("Karta MasterCard"));
        assertTrue(nameables[1].getName().equals("Grupa"));
    }

    /***
     * PinPassword, TextPassword i PasswordGroup - metoda check(...)
     */

    /***
     * Sprawdzanie hasła dla klasy PinPassword
     * @difficulty 2
     */
    @org.junit.Test
    public void passwordCheckPinPasswordCorrect() {
        Password pw1 = new PinPassword(1,2,3,4);
        assertTrue(pw1.check(new int[] {1,2,3,4}));
    }

    /***
     * Sprawdzanie hasła dla klasy PinPassword
     * @difficulty 2
     */
    @org.junit.Test
    public void passwordCheckPinPasswordIncorrect() {
        Password pw1 = new PinPassword(3,2,1,5,4);
        assertTrue(pw1.check(new int[] {3,2,1,5,4}));
        assertFalse(pw1.check(new int[] {1,2,3,4}));
        assertFalse(pw1.check("qwerty"));
    }

    /***
     * Sprawdzanie hasła dla klasy TextPassword
     * @difficulty 2
     */
    @org.junit.Test
    public void passwordCheckTextPasswordCorrect() {
        Password pw1 = new TextPassword("3edc$RFV");
        assertTrue(pw1.check("3edc$RFV"));
    }

    /***
     * Sprawdzanie hasła dla klasy TextPassword
     * @difficulty 2
     */
    @org.junit.Test
    public void passwordCheckTextPasswordIncorrect() {
        Password pw1 = new TextPassword("1qaz@WSX");
        assertTrue(pw1.check("1qaz@WSX"));
        assertFalse(pw1.check(new int[] {1,2,3,4}));
        assertFalse(pw1.check("qwerty"));
    }

    /***
     * Sprawdzanie hasła dla klasy PasswordGroup
     * @difficulty 2
     */
    @org.junit.Test
    public void passwordGroupCheck() {
        Password pw1 = new PinPassword(4,3,2,1);
        Password pw2 = new TextPassword("4rfv%T^GB");
        pw1.setName("Karta");
        pw2.setName("Konto");
        PasswordGroup passwordGroup = new PasswordGroup(pw1, pw2);
        assertFalse(passwordGroup.check("Karta","1qaz@WSX"));
        assertFalse(passwordGroup.check("Karta",new int[] {1,2,3,4}));
        assertTrue(passwordGroup.check("Karta",new int[] {4,3,2,1}));
        assertFalse(passwordGroup.check("Konto","1qaz@WSX"));
        assertFalse(passwordGroup.check("Konto",new int[] {1,2,3,4}));
        assertTrue(passwordGroup.check("Konto", "4rfv%T^GB"));
        assertFalse(passwordGroup.check("Nie ma takiego", "asdsadas"));
    }
}
