package sy.amjad.dataStrusture.dynamicArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    private DynamicArray<Integer> dynamicArray;

    @BeforeEach
    void setUp() {
        dynamicArray = new DynamicArray<>();
    }

    @Test
    void testPutAndGet() {
        dynamicArray.put(1);
        assertEquals(1, dynamicArray.get(0));
    }

    @Test
    void testRemove() {
        dynamicArray.put(1);
        dynamicArray.put(2);
        assertEquals(2, dynamicArray.remove());
        assertEquals(1, dynamicArray.getSize());
    }

    @Test
    void testEnsureCapacity() {
        for (int i = 0; i < 1000; i++) {
            dynamicArray.put(i);
        }
        assertEquals(1000, dynamicArray.getSize());
        assertEquals(999, dynamicArray.get(999));
    }


    @Test
    void testIterator() {
        dynamicArray.put(1);
        dynamicArray.put(2);
        Iterator<Integer> iterator = dynamicArray.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testForEach() {
        dynamicArray.put(1);
        dynamicArray.put(2);
        dynamicArray.forEach(element -> assertTrue(element == 1 || element == 2));
    }
}