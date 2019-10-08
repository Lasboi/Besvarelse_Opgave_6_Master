package Opgave_6_6;

import junit.framework.TestCase;

public class PatternsTest extends TestCase {

    /*
        Test Case

        Input: n = 1
        Forventet output: 1

        Input: n = 1
        Forventet output: 2
     */

    public void testIfConsolePrintsOne() {

        int n = 1;

        String result = Patterns.number(n);

        assertEquals("1", result);


    }

    public void testIfConsolePrintsTwo() {

        int n = 2;

        String result = Patterns.number(n);

        assertEquals("2", result);
    }

}