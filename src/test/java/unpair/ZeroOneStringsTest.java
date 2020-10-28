package unpair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ZeroOneStringsTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1); // max 1 second per method

    private String input;
    private int answer;

    public ZeroOneStringsTest(String input, int answer) throws IllegalArgumentException, InstantiationException {
        this.input = input;
        this.answer = answer;
    }

    @Test
    public void test() {
        assertEquals(answer, ZeroOneStrings.getMinimumPairs(input));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testInstances() {
        String[] inputs = {
                "0100",
                "??",
                "0?0",
                "0??1???001?0???0",
                "?11?1001???101?1?0000?0110????0?001?110?0?"
        };

        Integer[] expOuts = {
                1,
                0,
                0,
                3,
                10
        };

        Object[][] parameters = new Object[inputs.length][2];
        for (int i = 0; i < inputs.length; i++) {
            parameters[i] = new Object[]{inputs[i], expOuts[i]};
        }
        return Arrays.asList(parameters);
    }

}
