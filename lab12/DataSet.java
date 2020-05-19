package mini.oo20.lab12;

import javafx.util.Pair;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataSet {

    private List<String> header = new ArrayList<String>();
    private List<List<String>> data = new ArrayList<List<String>>();

    // @TODO
    public DataSet(String filename, boolean hasHeader)  {

    }

    public List<String> getColumn(String name) {

        if (header.isEmpty()) return null;

        int index = header.indexOf(name);
        if (index < 0) return null;

        List<String> cdata = data.stream().map(l->l.get(index)).collect(Collectors.toList());

        return cdata;
    }

    public List<Long> getColumnAsLong(String name) {

        List<String> list = getColumn(name);
        if (list == null) return null;

        List<Long> cdata = list.stream().map(s->Long.parseLong(s)).collect(Collectors.toList());

        return cdata;
    }

    // @TODO
    public long getUniqueCount(String name) {

        return 0;
    }

    // @TODO
    public Long getMinAsLong(String name) {

        return null;
    }

    // @TODO
    public List<String> getColumn(String name, String ... criteria) {

        return null;
    }

    // @TODO
    public List<Long> getColumnAsLong(String name, String ... criteria) {

        return null;
    }

}
