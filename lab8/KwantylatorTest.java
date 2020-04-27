package mini.java.lab8.test;

import mini.java.lab8.FileDoubleKwantylator;
import mini.java.lab8.FileObjectKwantylator;
import mini.java.lab8.Kwantylator;
import mini.java.lab8.My2DObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Double [] data = {1.2491061, 4.1050404, 2.0028673, 2.0147486, 0.5906676, 2.5623679, 2.0235319, 2.1096685, 2.5861802, 1.7931584, 3.2356473};
        var kw1 = new Kwantylator<Double>(data);
        // int[] j = {1,2,3,4};
        double q10 = kw1.kwantyl(0.1);
        double q90 = kw1.kwantyl(0.9);

        assertEquals(q10, 1.24, 0.1);
        assertEquals(q90, 3.23, 0.1);
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
        Double kwa = 0.0;

        try {
            File f = new File("liczby.txt");

            FileInputStream fin = new FileInputStream(f);
            var kw1 = new FileDoubleKwantylator(fin);
            fin.close();

            med = kw1.median();
            kwa = kw1.kwantyl(0.75);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(med, 100, 0.3);
        assertEquals(kwa, 106, 0.3);


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

    /***
     * Prosty equals() - wypisywanie zmiennych double binarnie
     * @difficulty 5
     */
    @org.junit.Test
    public void binaryOutputFile() {

        List <Double> arr = new ArrayList <Double>();

        try {
            File f = new File("liczby.txt");

            FileInputStream fin = new FileInputStream(f);
            var kw1 = new FileDoubleKwantylator(fin);
            fin.close();

            FileOutputStream fout = new FileOutputStream("kwantyle.bin");

            kw1.wypiszBinarnie(fout,0.1, 0.2, 0.25, 0.3, 0.4, 0.5, 0.65, 0.75, 0.85, 0.99);

            fout.close();

            FileInputStream fin2 = new FileInputStream("kwantyle.bin");

            DataInputStream din = new DataInputStream(fin2);

            while (din.available() > 0) {
                Double x = din.readDouble();
                arr.add(x);
            }

            fin2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(arr.get(0), 86.5, 0.3);
        assertEquals(arr.get(1), 91.3, 0.3);
        assertEquals(arr.get(2), 93.0, 0.3);
        assertEquals(arr.get(3), 94.5, 0.3);
        assertEquals(arr.get(4), 97.0, 0.3);
        assertEquals(arr.get(5), 99.7, 0.3);
        assertEquals(arr.get(6), 103.3, 0.3);
        assertEquals(arr.get(7), 106.2, 0.3);
        assertEquals(arr.get(8), 110.0, 0.3);
        assertEquals(arr.get(9), 124.1, 0.3);

    }

    /***
     * Prosty equals() - wypisywanie zmiennych double tekstowo
     * @difficulty 5
     */
    @org.junit.Test
    public void textOutputFile() {

        List <Double> arr = new ArrayList <Double>();

        try {
            File f = new File("liczby.txt");

            FileInputStream fin = new FileInputStream(f);
            var kw1 = new FileDoubleKwantylator(fin);
            fin.close();

            FileWriter fout = new FileWriter("kwantyle.txt");

            kw1.wypiszTekstowo(fout,0.05, 0.15, 0.35, 0.45, 0.55, 0.60, 0.70, 0.80, 0.90);

            fout.close();

            FileInputStream fin2 = new FileInputStream("kwantyle.txt");

            Scanner scanner = new Scanner(fin2);

            while (scanner.hasNext()) {
                Double x = scanner.nextDouble();
                arr.add(x);
            }
            fin2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(arr.get(0), 83.4, 0.3);
        assertEquals(arr.get(1), 89.3, 0.3);
        assertEquals(arr.get(2), 95.6, 0.3);
        assertEquals(arr.get(3), 98.5, 0.3);
        assertEquals(arr.get(4), 100.9, 0.3);
        assertEquals(arr.get(5), 102.0, 0.3);
        assertEquals(arr.get(6), 104.6, 0.3);
        assertEquals(arr.get(7), 107.7, 0.3);
        assertEquals(arr.get(8), 111.9, 0.3);
    }


}