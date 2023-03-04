package org.ns.arrays;

public interface CustomList<E> extends Iterable<E> {

    boolean isEmpty();

    int size();

    boolean add(E element);

    boolean add(int index, E element);

    void remove(E element);

    E get(int index);

    int indexOf(E element);

    void set(int index, E element);

    boolean contains(E element);

    void clear();

    E[] toArray();

}
