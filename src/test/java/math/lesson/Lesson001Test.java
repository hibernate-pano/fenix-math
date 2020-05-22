package math.lesson;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Lesson001Test {

    @Test
    void decimalToBinary() {
        int decimal = 101;

        Lesson001 lesson001 = new Lesson001();
        String binary01 = lesson001.decimalToBinary01(decimal);
        String binary02 = lesson001.decimalToBinary02(decimal);

        System.out.println("binary01 = " + binary01);
        System.out.println("binary02 = " + binary02);

        assertEquals(binary01, binary02);
    }
}