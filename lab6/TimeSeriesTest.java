package mini.java.basic.arrays.test;

import static org.junit.Assert.*;

public class TimeSeriesTest {


    /***
     * Prosty equals() - sprawdzenie dla identycznych
     * @difficulty 1
     */
    @org.junit.Test
    public void primitiveEquals() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries("TS1",j);
        assertFalse(timeSeries1 == timeSeries2);
    }

    /***
     * Prosty equals() - sprawdzenie dla różnych
     * @difficulty 1
     */
    @org.junit.Test
    public void equalsFalse() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries("TS2",j);
        assertNotEquals(timeSeries1, timeSeries2);
    }

    /***
     * Prosty equals() - sprawdzenie dla różnych
     * @difficulty 1
     */
    @org.junit.Test
    public void equalsFalseArray() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3};
        TimeSeries timeSeries2 = new TimeSeries("TS1",j);
        assertNotEquals(timeSeries1, timeSeries2);
    }
    /***
     * Prosty equals
     * @difficulty 1
     */
    @org.junit.Test
    public void equalsTrue() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries("TS1",j);
        assertEquals(timeSeries1, timeSeries2);
    }

    /***
     * Prosty equals - sprawdzenie dla nazwy *null*
     * @difficulty 1
     */
    @org.junit.Test
    public void equalsTrueNullName() {
        TimeSeries timeSeries1 = new TimeSeries(null,1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries(null,j);
        assertEquals(timeSeries1, timeSeries2);
    }

    /***
     * Prosty hashcode() - sprawdzenie czy generowane są identyczne
     * @difficulty 1
     */
    @org.junit.Test
    public void hashcodeEquals() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries("TS1",j);
        assertEquals(timeSeries1.hashCode(), timeSeries2.hashCode());
    }

    /***
     * Prosty hashcode() - sprawdzenie czy zmiana nazwy wpływa na hashcode()
     * @difficulty 1
     */
    @org.junit.Test
    public void hashcodeNotEqualsName() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3,4};
        TimeSeries timeSeries2 = new TimeSeries("TS2",j);
        assertNotEquals(timeSeries1.hashCode(), timeSeries2.hashCode());
    }

    /***
     * Prosty hashcode() - sprawdzenie czy zmiana danych serii wpływa na hashcode()
     * @difficulty 1
     */
    @org.junit.Test
    public void hashcodeNotEqualsValue() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,4);
        int[] j = {1,2,3};
        TimeSeries timeSeries2 = new TimeSeries("TS1",j);
        assertNotEquals(timeSeries1.hashCode(), timeSeries2.hashCode());
    }

    /***
     * Sprawdzenie działania metody zmiennej _name_
     * @difficulty 1
     */
    @org.junit.Test
    public void averageTest() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3);
        TimeSeries timeSeries2 = new TimeSeries("TS1",4,2,3);
        assertEquals(2.0, timeSeries1.average(),0);
        assertEquals(3.0, timeSeries2.average(),0);
    }

    /***
     * Sprawdzenie gettera zmiennej _name_
     * @difficulty 1
     */
    @org.junit.Test
    public void getNameTest() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3);
        assertEquals(timeSeries1.getName(),"TS1");
    }

    /***
     * Sprawdzenie gettera zmiennej @name
     * @difficulty 1
     */
    @org.junit.Test
    public void getNameTestNull() {
        TimeSeries timeSeries1 = new TimeSeries(null,1,2,3);
        assertEquals(timeSeries1.getName(),null);
    }

    /***
     * Sprawdzenie metody getMaximum dla liczb ujemych
     * @difficulty 1
     */
    @org.junit.Test
    public void getMaximumTest() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3,5,6,1);
        assertEquals(timeSeries1.getMaximum(),6);
    }

    /***
     * Sprawdzenie metody getMaximum dla liczb ujemych
     * @difficulty 1
     */
    @org.junit.Test
    public void getMaximumTestNegative() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",-1,-2,-3,-5,-6,-1,-11);
        assertEquals(timeSeries1.getMaximum(),-1);
    }



    /***
     * Sprawdzenie metody average klasy AnonymousTimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesAverageTst() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(1,2,3);
        assertEquals(2.0, timeSeries1.average(),0);
    }
    /***
     * Sprawdzenie getter pola name klasy AnonymousTimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesNameTest() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(5,6);
        assertNull(timeSeries1.getName());
    }

    /***
     * Sprawdzenie metody equals klasy AnonymousTimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesEqualityTest() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(5,4,3);
        TimeSeries timeSeries2 = new AnonymousTimeSeries(5,4,3);
        assertEquals(timeSeries1, timeSeries2);
        assertEquals(timeSeries2, timeSeries1);
    }

    /***
     * Sprawdzenie metody equals klasy AnonymousTimeSeries wględem klasy bazowej TimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesEqualityTestAgainstBase() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(5,4,3);
        TimeSeries timeSeries2 = new TimeSeries("anonymous", 5,4,3);
        assertNotEquals(timeSeries1, timeSeries2);
        assertNotEquals(timeSeries2, timeSeries1);
    }

    /***
     * Sprawdzenie metody average klasy AnonymousTimeSeries wględem klasy bazowej gdzie nazwa jest Null
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesEqualityTestAgainstBaseWithNull() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(5,4,3);
        TimeSeries timeSeries2 = new TimeSeries(null, 5,4,3);
        assertNotEquals(timeSeries1, timeSeries2);
        assertNotEquals(timeSeries2, timeSeries1);
    }

    /***
     * Sprawdzenie metody toString klasy AnonymousTimeSeries - nie powinna zawierać pola name, ale powinna zawierać wartości
     * @difficulty 1
     */
    @org.junit.Test
    public void anonymousTimeSeriesToStringNoName() {
        TimeSeries timeSeries2 = new AnonymousTimeSeries(5,4,3);
        assertTrue(!timeSeries2.toString().toLowerCase().contains("name=")
                && timeSeries2.toString().toLowerCase().contains("5")
                && timeSeries2.toString().toLowerCase().contains("4")
                && timeSeries2.toString().toLowerCase().contains("3"));
    }

    /***
     * Sprawdzenie metody toString klasy TimeSeries - powinna zawierać pole name i zawierać wartości
     * @difficulty 1
     */
    @org.junit.Test
    public void timeSeriesToStringName() {
        TimeSeries timeSeries2 = new TimeSeries("anonymous", 5,4,3);
        assertTrue(timeSeries2.toString().toLowerCase().contains("name=")
                && timeSeries2.toString().toLowerCase().contains("5")
                && timeSeries2.toString().toLowerCase().contains("4")
                && timeSeries2.toString().toLowerCase().contains("3"));
    }

    /***
     * Sprawdzenie metody isAnonymous() na klasie bazowej TimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void isAnonymousBaseClass() {
        TimeSeries timeSeries1 = new TimeSeries("TS1",1,2,3);
        assertFalse(timeSeries1.isAnonymous());
    }

    /***
     * Sprawdzenie metody isAnonymous() na klasie AnonymousTimeSeries rzutowanej na TimeSeries
     * @difficulty 1
     */
    @org.junit.Test
    public void isAnonymousInheritedClass() {
        TimeSeries timeSeries1 = new AnonymousTimeSeries(5);
        assertTrue(timeSeries1.isAnonymous());
    }

    /***
     * Prosty average() - sprawdzenie czy osbsługuje pusta tablice
     * @difficulty 1
     */
    @org.junit.Test
    public void emptyDataEqual() {
        int[] j = {};
        TimeSeries timeSeries1 = new TimeSeries("TS1",j);
        assertEquals(timeSeries1.average(), Double.NaN, 0.0);
    }

    /***
     * Prosty average() - sprawdzenie czy osbsługuje tablice null
     * @difficulty 1
     */
    @org.junit.Test
    public void nullDataEqual() {
        int[] j = null;
        TimeSeries timeSeries1 = new TimeSeries("TS1",j);
        assertEquals(timeSeries1.average(), Double.NaN, 0.0);
    }


}
