package ru.vsu.cs;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Tablet> list = FileReader.outputTabletsList(args[0]);
        try {
            Tablet result = Sort.findTheMostSuitableTablet(list, parseInt(args[2]));
            FileWriter.writeFile(result, args[1]);
        } catch (Exception e) {
            System.out.println("You haven't enough money to buy a tablet!");
        }
    }
}

