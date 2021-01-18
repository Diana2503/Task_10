package ru.vsu.cs;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<Tablet> readFile(String fileName) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileName));
        List<String> InputLine = new ArrayList<>();
        while (bufferedReader.ready()) {
            InputLine.add(bufferedReader.readLine());
        }
        String[][] array = new String[InputLine.size()][4];
        for (int i = 0; i <= InputLine.size() - 1; i++) {
            array[i] = InputLine.get(i).split(", ");
        }
        List<Tablet> list = new ArrayList<>();
        Tablet buffer;
        for (int i = 0; i <= array.length - 1; i++) {
            buffer = new Tablet("0", 0, 0, 0);
            buffer.modelName = array[i][0];
            buffer.memorySize = Integer.parseInt(array[i][1]);
            buffer.modelRatingAmongUsers = Integer.parseInt(array[i][2]);
            buffer.tabletPrice = Integer.parseInt(array[i][3]);
            list.add(buffer);
        }
        return list;
    }
}
