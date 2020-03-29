package mini.java.basic.interfaces;

import java.util.List;

public class IntegerTimeSeries extends AbstractTimeSeries<Integer> implements Summable<Integer>{


    public IntegerTimeSeries(String name, List<Integer> data) {
        super(name, data);
    }


    // TODO: dodaj i zaimplementuj brakujace metody
}
