import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ExercisesTester {
    //Ex.1
    @Test
    void AreIntEquals() {
        Integer intA = 5;
        Integer intB = 5;
        Integer intC = 10;
        assertEquals(intA, intB);
        assertEquals(intC, intA);
        assertNotEquals(intB, intC);
    }

    //Ex.2
    @Test
    void AreObjectsEquals() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();
        assertSame(obj1, obj2);
        assertNotSame(obj1, obj3);
    }

    //Ex.3
    @Test
    void AreIntegerArrayEquals() {
        int[] intA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intB = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(intA, intB);
        assertFalse(Arrays.equals(intA, intB));
    }

    //Ex.4
    @Test
    void ObjectArrayEquals() {
        ArrayList<Object> ObjectArray = new ArrayList<>();
        Person per1 = new Person("Ignasi");
        Person per2 = new Person("Pere");
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota");
        Person per3 = new Person("Josep");
        ObjectArray.add(car1);
        ObjectArray.add(car2);
        ObjectArray.add(per1);
        ObjectArray.add(per2);

        assertThat(ObjectArray).containsExactly(car1, car2, per1, per2);
        assertThat(ObjectArray).containsExactlyInAnyOrder(per1, per2, car1, car2);
        assertThat(ObjectArray).containsOnlyOnce(per1);
        assertThat(ObjectArray).doesNotContain(per3);
        assertEquals(1, Collections.frequency(ObjectArray, per1));

    }
    //Ex.5
    @Test
    void Maptesting() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        assertTrue(map1.containsKey("one"));
    }
    //Ex.6
    @Test
    void testArrayIndexOutOfBoundsException() {
        int[] intA = {1, 2, 3, 4};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int value = intA[5];
        });
    }
    //Ex.7
    @Test
    void testEmptyObject() {
        Optional<Person> person = Optional.empty();
        assertTrue(true);
    }
}