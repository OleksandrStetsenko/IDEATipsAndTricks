package home.stetsenko;

import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.assertArrayEquals;

public class SorterTest {

    @Test
    public void test() throws Exception {
        String[] strings = Sorter.loadAndSort(new StringReader("b\nc\na"));
        String[] expected = {"a","b","c"};
        assertArrayEquals(expected, strings);
        User olst = new User("olst", 27);
        String[] strings1 = Sorter.loadAndSort(null);
    }
}