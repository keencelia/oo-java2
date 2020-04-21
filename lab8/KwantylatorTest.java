package mini.java.lab8.test;

import mini.java.lab8.FileDoubleKwantylator;
import mini.java.lab8.FileObjectKwantylator;
import mini.java.lab8.Kwantylator;
import mini.java.lab8.My2DObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class KwantylatorTest {

    /***
     * Prosty equals() - sprawdzenie dla nieparzystych
     * @difficulty 1
     */
    @org.junit.Test
    public void integerOddEquals() {
        var kw1 = new Kwantylator<Integer>(1,2,3,4,5);
        int median = kw1.median();
        assertEquals(median, 3);
    }

    /***
     * Prosty equals() - sprawdzenie dla parzystych
     * @difficulty 2
     */
    @org.junit.Test
    public void integerEvenEquals() {
        var kw1 = new Kwantylator<Integer>(1,2,3,4,5,6);
        int median = kw1.median();
        assertEquals(median, 3);
    }

    /***
     * Prosty equals() - sprawdzenie nullowych tablic
     * @difficulty 1
     */
    @org.junit.Test
    public void nullEquals() {
        Integer [] data = null;
        var kw1 = new Kwantylator<Integer>(data);
        Integer median = kw1.median();
        assertEquals(median, null);
    }

    /***
     * Prosty equals() - sprawdzenie pustych tablic
     * @difficulty 1
     */
    @org.junit.Test
    public void emptyEquals() {
        var kw1 = new Kwantylator<Integer>(new Integer[0]);
        Integer median = kw1.median();
        assertEquals(median, null);
    }


    /***
     * Prosty equals() - sprawdzenie innych kwantyli
     * @difficulty 3
     */
    @org.junit.Test
    public void quantileEquals() {
        Double [] data = {1.2491061, 4.1050404, 2.0028673, 2.0147486, 0.5906676, 2.5623679, 2.0235319, 2.1096685, 2.5861802, 1.7931584};
        var kw1 = new Kwantylator<Double>(data);
        // int[] j = {1,2,3,4};
        double q10 = kw1.kwantyl(0.1);
        double q90 = kw1.kwantyl(0.9);

        assertEquals(q10, 0.59, 0.1);
        assertEquals(q90, 2.58, 0.1);
    }

    /***
     * Prosty equals() - sprawdzenie dla stringów
     * @difficulty 2
     */
    @org.junit.Test
    public void stringEquals() {
        String [] data = {"abc", "aac", "xyz", "ala", "ma", "asa", "kot", "qwe", "tyu", "aaa"};
        var kw1 = new Kwantylator<String>(data);
        String median = kw1.median();
        assertEquals(median, "asa");
    }

    /***
     * Prosty equals() - sprawdzenie dla obiektów nieoczywistych
     * @difficulty 4
     */
    @org.junit.Test
    public void someObjectList() {
        var nc1 = new My2DObject(0.5, 0.7);
        var nc2 = new My2DObject(0.5, 0.6);
        var nc3 = new My2DObject(0.9, 0.71);

        var kw1 = new Kwantylator<My2DObject>(nc1,nc2,nc3);

        My2DObject med = kw1.median();
        assertEquals(med.getX1(), 0.5, 0);
        assertEquals(med.getX2(), 0.7, 0);

    }

    /***
     * Prosty equals() - sprawdzenie dla obiektów nieoczywistych
     * @difficulty 5
     */
    @org.junit.Test
    public void someDoubleFile() {

        Double med = 0.0;

        try {
            File f = new File("liczby.txt");

            FileInputStream fin = new FileInputStream(f);
            var kw1 = new FileDoubleKwantylator(fin);
            fin.close();

            med = kw1.median();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(med, 100, 0.3);

    }

    /***
     * Prosty equals() - sprawdzenie dla obiektów nieoczywistych
     * @difficulty 5
     */
    @org.junit.Test
    public void someObjectFile() {

        My2DObject med = null;

        try {
            File f = new File("obiekty.bin");

            FileInputStream fin = new FileInputStream(f);
            var kw1 = new FileObjectKwantylator(fin);
            fin.close();

            med = kw1.median();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(med.getX1(), 0.018, 0.001);
        assertEquals(med.getX2(), -1.058, 0.001);

    }


}
