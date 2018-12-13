package Adapter.IteratorExample;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
public class EnumerationIterator implements Iterator {
     Enumeration  enumer;

    public EnumerationIterator(Enumeration enumer) {
        this.enumer = enumer;
    }

    @Override
    public boolean hasNext() {
        return enumer.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumer.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
