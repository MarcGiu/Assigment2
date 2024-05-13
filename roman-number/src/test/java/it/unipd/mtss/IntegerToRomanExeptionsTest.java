////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

public class IntegerToRomanExeptionsTest {

    @Test(expected=IllegalArgumentException.class)
    public void TestError_IllegalMinArgument() {
        int number = 0;
        String expected = IntegerToRoman.convert(number);
    }

    @Test(expected=IllegalArgumentException.class)
    public void TestError_IllegalMaxArgument() {
        int number = 7;
        String expected = IntegerToRoman.convert(number);
    }

}
