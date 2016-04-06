package home.stetsenko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("src/main/resources/input.txt");
        String[] array = loadAndSort(in);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static String[] loadAndSort(Reader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        String line;
        ArrayList<String> strings = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                line = "empty";
            }
            strings.add(line);
        }
        reader.close();
        String[] array = strings.toArray(new String[strings.size()]);
        Arrays.sort(array);
        return array;
    }
}
