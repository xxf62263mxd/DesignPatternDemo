package iterator;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private MyList<T> list;
    private int count;

    public MyIterator(MyList<T> list) {
        this.list = list;
        count = list.size() ;
    }

    @Override
    public boolean hasNext() {
        return count > 0;
    }

    @Override
    public T next() {
        if(count <= 0)
            throw new ArrayIndexOutOfBoundsException();
        count--;
        return list.get(count);
    }
}
