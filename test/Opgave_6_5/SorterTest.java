package Opgave_6_5;

import junit.framework.TestCase;

public class SorterTest extends TestCase {

    public void testDisplaySortedNumbers() {
        double x = 5;
        double y = 10;
        double z = 8;
        Sorter.displaySortedNumbers(x, y, z);

        assertEquals("Resultatet er: 5.0 8.0 10.0", Sorter.output);

    }
}