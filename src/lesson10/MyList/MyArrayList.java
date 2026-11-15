package lesson10.MyList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {

    public static final int DEFAULT_CAPACITY = 10;
    private Object[] defaultArray;

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[count] != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        else return false;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < size(); i++) {
            if (defaultArray[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        if (size() == defaultArray.length) {
            Object[] newArray = new Object[size() * 2];
            for (int i = 0; i < size(); i++) {
                newArray[i] = defaultArray[i];
            }
            newArray[size()] = value;
            defaultArray = newArray;
        } else defaultArray[size()] = value;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        for (int i = size() + 1; i > index; i--) {
            defaultArray[i] = defaultArray[i - 1];
        }
        defaultArray[index] = value;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < size(); i++) {
            if (defaultArray[i].equals(value)) {
                for (int j = i; j < size(); j++) {
                    defaultArray[j] = defaultArray[j + 1];
                }
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        if (value.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            Object[] newArray = new Object[size() * 2 + value.size()];
            for (int i = 0; i < size(); i++) {
                newArray[i] = defaultArray[i];
            }
            for (int i = size(); i < size() + value.size(); i++) {
                for (T v : value) {
                    newArray[i] = v;
                }
            }
            defaultArray = newArray;
        }

        return true;
    }

    @Override
    public T get(int index) {
        return (T) defaultArray[index];
    }

    @Override
    public T remove(int index) {
        T removeElement = (T) defaultArray[index];
        for (int i = index; i < size(); i++) {
            defaultArray[i] = defaultArray[i + 1];
        }

        return removeElement;
    }

    @Override
    public T set(int index, T value) {
        defaultArray[index] = value;
        return (T) defaultArray[index];
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size(); i++) {
            if (defaultArray[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void view() {
        for (int i = 0; i < size(); i++) {
            System.out.println(i + " элемент: " + defaultArray[i]);
        }
    }

    MyArrayList() {
        this.defaultArray = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList(int capacity) {
        this.defaultArray = new Object[capacity];
    }

    MyArrayList(MyList<? extends T> col) {
        if (col.isEmpty()) {
            this.defaultArray = new Object[DEFAULT_CAPACITY];
        } else {
            this.defaultArray = new Object[col.size() * 2];
            for (int i = 0; i < col.size(); i++) {
                defaultArray[i] = col.get(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return Objects.deepEquals(defaultArray, that.defaultArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(defaultArray);
    }
}
