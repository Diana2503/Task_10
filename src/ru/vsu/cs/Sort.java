package ru.vsu.cs;

import java.util.List;

public class Sort {
    public static int comparisonOfTabletsByCriteria(Tablet tablet1, Tablet tablet2) {
        if (tablet1.memorySize != tablet2.memorySize) {
            return tablet1.memorySize - tablet2.memorySize;
        }
        if (tablet1.modelRatingAmongUsers != tablet2.modelRatingAmongUsers) {
            return tablet1.modelRatingAmongUsers - tablet2.modelRatingAmongUsers;
        }
        int outputAfterComparison1 = 0;
        int outputAfterComparison2 = 0;
        if (tablet1.modelName.toLowerCase().equals("samsung") || tablet1.modelName.toLowerCase().equals("asus")) {
            outputAfterComparison1 = 1;
        }
        if (tablet2.modelName.toLowerCase().equals("samsung") || tablet2.modelName.toLowerCase().equals("asus")) {
            outputAfterComparison2 = 1;
        }
        return outputAfterComparison1 - outputAfterComparison2;
    }

    public static Tablet findTheMostSuitableTablet(List<Tablet> list, int moneyAmount) {
        Tablet mostSuitableTablet = null;
        for (Tablet tablet : list) {
            if (tablet.tabletPrice <= moneyAmount && (mostSuitableTablet == null || comparisonOfTabletsByCriteria(tablet, mostSuitableTablet) > 0)) {
                mostSuitableTablet = tablet;
            }
        }
        return mostSuitableTablet;
    }
}
