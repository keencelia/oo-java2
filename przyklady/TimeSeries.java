package mini.java.basic.generics;

import java.lang.reflect.Array;

public class TimeSeries<T extends Number> {
    private final String name;
    private final T[] data;

    public TimeSeries(String name, T... data) {
        this.name = name;
        this.data = data;
    }

    public static <U extends Number> TimeSeries<U> empty(String name, Integer length, Class<U> clazz) {
        @SuppressWarnings("unchecked")
        TimeSeries<U> timeSeries = new TimeSeries<>(name, (U[]) Array.newInstance(clazz, length));

        return timeSeries;
    }


    public String getName() {
        return name;
    }

    public T first() {
        if (data == null)
            throw new IndexOutOfBoundsException();
        return data[0];
    }

    public T last() {
        if (data == null)
            throw new IndexOutOfBoundsException();
        return data[data.length - 1];
    }

    public float firstFloat() {
        if (data == null)
            throw new IndexOutOfBoundsException();
        return data[data.length - 1].floatValue();
    }

    public <R extends Number> boolean nameEquals(TimeSeries<R> that) {
        return this.getName().equals(that.getName());
    }


    public static  <R extends Number, U extends Number> boolean staticNameEquals(TimeSeries<R> l,TimeSeries<U> r) {
        return l.getName().equals(r.getName());
    }

    public T[] getData() {
        return data;
    }
}
