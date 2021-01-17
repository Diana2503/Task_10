package ru.vsu.cs;

public class FileWriter {
    public static void writeFile(Tablet result, String fileName) throws Exception {
        java.io.FileWriter writer = new java.io.FileWriter(fileName);
        writer.write(result.modelName + " ");
        writer.write(result.memorySize + " ");
        writer.write(result.modelRatingAmongUsers + " ");
        writer.write(String.valueOf(result.tabletPrice));
        writer.close();
    }
}
