package math.lesson;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Lesson001Test {

    @Test
    void decimalToBinary01() {
        int decimal = 0;

        Lesson001 lesson001 = new Lesson001();
        String binary01 = lesson001.decimalToBinary01(decimal);
        System.out.println("binary01 = " + binary01);

        assertEquals(binary01, Integer.toBinaryString(decimal));
    }

    @Test
    void decimalToBinary02() {
        int decimal = 0;

        Lesson001 lesson001 = new Lesson001();
        String binary02 = lesson001.decimalToBinary02(decimal);
        System.out.println("binary02 = " + binary02);

        assertEquals(binary02, Integer.toBinaryString(decimal));
    }
}