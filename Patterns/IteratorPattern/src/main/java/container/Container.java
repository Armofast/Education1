package container;

import iterator.Iterator;

/**
 * Created by dirty on 01.02.16.
 */
public class Container {
    private String[] names;

    public Container(String[] names) {
        this.names = names;
    }
public Iterator getIterator(){
    return new ContainerIterator();
}
    private class ContainerIterator implements Iterator {
        int index=0;

        @Override
        public boolean hasNext() {
            if (index<names.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if(index<names.length)
            return names[index++];
            return null;

        }
    }
}
