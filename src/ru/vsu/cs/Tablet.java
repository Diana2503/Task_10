package ru.vsu.cs;

public class Tablet {
    public String modelName;
    public int memorySize;
    public int modelRatingAmongUsers;
    public int tabletPrice;

    public Tablet(String modelName, int memorySize, int modelRatingAmongUsers, int tabletPrice) {
        this.modelName = modelName;
        this.memorySize = memorySize;
        this.modelRatingAmongUsers = modelRatingAmongUsers;
        this.tabletPrice = tabletPrice;
    }
}
