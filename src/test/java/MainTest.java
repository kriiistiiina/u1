import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void differenceTrue() {
        int a=20;
        int b=50;
        int c = Main.difference(a, b);
        assertEquals(-22, c);
    }

    @Test
    public void differenceFalse() {
        int a=20;
        int b=50;
        int c = Main.difference(a, b);
        assertEquals(10, c);
    }
    @Test
    public void arrea() {
        int a=20;
        int c = (int) Main.calculateCircleLength(a);
        assertEquals(10, c);
    }

    @Test
    public void calculateCircleArea() {
        int a=8;
        int c = (int) Main.calculateCircleArea(a);
        assertEquals(5, c);
    }
}