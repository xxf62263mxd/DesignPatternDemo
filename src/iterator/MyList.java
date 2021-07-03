package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<T> implements Iterable<T>{

    private List<T> list = new ArrayList<>();

    public void add(T e){
        list.add(e);
    }

    public void remove(T e){
        list.remove(e);
    }

    public int size(){
        return list.size();
    }

    public T get(int index){
        return list.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }
}
