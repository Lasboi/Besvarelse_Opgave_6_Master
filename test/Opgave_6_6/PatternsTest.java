package Opgave_6_6;

import junit.framework.TestCase;

public class PatternsTest extends TestCase {

    /*
        Test Case
        Input: n = 1
        Forventet output: 1
     */

    public void testIfConsolePrintsOne() {

        int n = 1;

        int result = Patterns.number(n);

        assertEquals(1, result);


    }

}