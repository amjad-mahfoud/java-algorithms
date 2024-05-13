package sy.amjad.dataStrusture.dynamicArray;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicArray<T> implements Iterable<T> {
    private Object[] data;

    @Getter
    private int size;

    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void put(T element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    public T remove() {
        T removedElement = (T) data[size - 1];
        this.size--;

        return removedElement;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = this.getSize();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return get(index++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (int i = 0; i < size; i++) {
            action.accept(get(i));
        }
    }

    @Override
    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }
}
