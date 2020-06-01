package mini.oo20.lab14;

import java.util.*;

public class Process {

    public static void main(String [] args) {

        String end = "end";
        Producer p = new Producer("datafile.txt");
        int numc = 5;

        Consumer [] c = new Consumer[numc];

        for (int i = 0; i < numc; i++) {
            c[i] = new Consumer(p, end);
        }

        Thread [] ct = new Thread[numc];

        for (int i = 0; i < numc; i++) {
            ct[i] = new Thread(c[i]);
        }

        Thread pt = new Thread(p);

        for (int i = 0; i < numc; i++) {
            ct[i].start();
        }

        pt.start();

        try {
            pt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numc; i++) {
            try {
                ct[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        List <String>[] out = new List [numc];

        for (int i = 0; i < numc; i++) {
            out[i] = c[i].getCollected();
        }

        OptionalInt max = Arrays.stream(out).mapToInt(x->x.size()).max();
        int sum = Arrays.stream(out).mapToInt(x->x.size()).sum();

        for (int i = 0; i < numc; i++) {
            System.out.println(c[i].getId() + ":" + out[i].toString());
        }

        System.out.println("All words used: " + sum);
        System.out.println("Longest collection: " + max.getAsInt());


    }

}
