package Opgave_6_5;

import junit.framework.TestCase;

public class SorterTest extends TestCase {

    public void testDisplaySortedNumbers() {
        double x = 5;
        double y = 10;
        double z = 8;
        Sorter.displaySortedNumbers(x, y, z);

        assertEquals("Resultatet er: \n5.0 \n8.0 \n10.0", Sorter.output);

    }
}