////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanPrinterTest {

    private String input;
    private String expectedOutput;

    public RomanPrinterTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = {
                { "1", " _____  \n" +
                        "|_   _| \n" +
                        "  | |   \n" +
                        "  | |   \n" +
                        " _| |_  \n" +
                        "|_____| \n" },
                { "3", " _____   _____   _____  \n" +
                        "|_   _| |_   _| |_   _| \n" +
                        "  | |     | |     | |   \n" +
                        "  | |     | |     | |   \n" +
                        " _| |_   _| |_   _| |_  \n" +
                        "|_____| |_____| |_____| \n" },
                { "4", " _____  __      __ \n" +
                        "|_   _| \\ \\    / / \n" +
                        "  | |    \\ \\  / /  \n" +
                        "  | |     \\ \\/ /   \n" +
                        " _| |_     \\  /    \n" +
                        "|_____|     \\/     \n" },
                { "8", "__      __  _____   _____   _____  \n" +
                        "\\ \\    / / |_   _| |_   _| |_   _| \n" +
                        " \\ \\  / /    | |     | |     | |   \n" +
                        "  \\ \\/ /     | |     | |     | |   \n" +
                        "   \\  /     _| |_   _| |_   _| |_  \n" +
                        "    \\/     |_____| |_____| |_____| \n" },
                { "19", "__   __  _____  __   __ \n" +
                        "\\ \\ / / |_   _| \\ \\ / / \n" +
                        " \\ V /    | |    \\ V /  \n" +
                        "  > <     | |     > <   \n" +
                        " / . \\   _| |_   / . \\  \n" +
                        "/_/ \\_\\ |_____| /_/ \\_\\ \n" }};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testConvertNumbers() {
        assertEquals(expectedOutput,
                RomanPrinter.print(Integer.parseInt(input)));
    }

}
