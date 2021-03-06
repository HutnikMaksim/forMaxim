package by.it.girovka.jd01_11;

import java.util.*;

public class ListA<T> implements List<T> {


    private T[] elements =(T[]) new Object[0];

    private int size = 0;

    @Override
    public boolean add(T t) {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, elements.length * 3/2 + 1);
        }
        elements[size++]= t;
        return true;
    }
    @Override
    public T remove(int index) {

        T element = elements[index];
        System.arraycopy(elements, index +1, elements, index, size- index - 1);
        elements[--size] = null;
        return element;
    }


    @Override
    public T get(int index) {
        return elements[index];
    }
    @Override
    public int size() {
        return 0;
    }
    @Override
    public String toString(){
        StringBuilder out = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++){
            out.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        out.append("]");
        return out.toString();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }
        @Override
        public T set(int index, T element){
            return null;
        }
    @Override
    public void add(int index, T element) {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

}
