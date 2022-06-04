package seri5;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    @Test
    public void stacktest() {
        Stack<Integer> t = new Stack<>();
        assertTrue(t.empty());
        t.push(56);
        assertFalse(t.empty());
        t.push(78);
        assertEquals(78, t.peek());
        assertEquals(2, t.search(56));
        assertEquals(1, t.search(78));
        assertEquals(78, t.pop());
        assertEquals(56, t.pop());
        assertThrows(EmptyStackException.class, () -> {
            t.pop();
        });
        Stack<String> i=new Stack<>();
        assertTrue(i.empty());
        i.push("mahdiyeh");
        assertFalse(i.empty());
        i.push("reyhane");
        assertEquals("reyhane",i.peek());
        assertEquals(2,i.search("mahdiyeh"));
        assertEquals(1,i.search("reyhane"));
        assertEquals("reyhane",i.pop());
        assertEquals("mahdiyeh",i.pop());
        assertThrows(EmptyStackException.class, () -> {
            i.pop();
        });
        Stack<Double> o=new Stack<>();
        assertTrue(o.empty());
        o.push(2.33d);
        assertFalse(o.empty());
        o.push(3.44d);
        assertEquals(3.44d,o.peek());
        assertEquals(2,o.search(2.33d));
        assertEquals(1,o.search(3.44d));
        assertEquals(3.44d,o.pop());
        assertEquals(2.33d,o.pop());
        assertThrows(EmptyStackException.class, () -> {
            o.pop();
        });
        Stack<Float> z=new Stack<>();
        assertTrue(z.empty());
        z.push(2.3f);
        assertFalse(z.empty());
        z.push(3.4f);
        assertEquals(3.4f,z.peek());
        assertEquals(2,z.search(2.3f));
        assertEquals(1,z.search(3.4f));
        assertEquals(3.4f,z.pop());
        assertEquals(2.3f,z.pop());
        assertThrows(EmptyStackException.class, () -> {
            z.pop();
        });
        Stack<Character> x=new Stack<>();
        assertTrue(x.empty());
        x.push('a');
        assertFalse(x.empty());
        x.push('m');
        assertEquals('m',x.peek());
        assertEquals(2,x.search('a'));
        assertEquals(1,x.search('m'));
        assertEquals('m',x.pop());
        assertEquals('a',x.pop());
        assertThrows(EmptyStackException.class, () -> {
            x.pop();
        });




    }

}
