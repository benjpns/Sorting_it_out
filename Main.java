package sorting;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        runTimeParameter(args);
    }

    public static void runTimeParameter(String[] args) {
        String mainMenu = args[0].toUpperCase(Locale.ROOT).replace('-','X');
        Runtime type = Runtime.valueOf(mainMenu);
        boolean matchEnum = false;
        boolean matchSort = false;
        try {
            matchEnum = type.getLine().equals(args[1]) ||
                    type.getWord().equals(args[1]) ||
                    type.getLongs().equals(args[1]);
        } catch (NullPointerException e) {
            matchSort = type.getSort().equals(args[1]);
        }
        UserInput ui = new UserInput();
        SortInterface sInterface = () -> ui.input.size();
        SortedData sData = () -> Collections.sort(ui.input);
        BigNumber large = () -> Collections.max(ui.input);
        Times times = () -> Collections.frequency(ui.input, large.Large());
        Percentage percent = () -> ((double)times.times() / sInterface.TotalNumbers()) * 100;

        try {
            switch (mainMenu) {
                case "XDATATYPE":
                    if (matchEnum) {
                        System.out.printf("Total numbers: %d\nThe longest number: %d (%d time(s), %d%%)", sInterface.TotalNumbers(), large.Large(), times.times(),(int)percent.percent());
                    } else {
                        System.out.println("Check runtime parameter typo.");
                    }
                    break;
                case "SORTINGTOOL":
                    if (matchSort) {
                        sData.SortData();
                        StringBuilder sbs = new StringBuilder();
                        for (Integer s : ui.input) {
                            sbs.append(s).append(" ");
                        }
                        System.out.println("Total numbers: " + sInterface.TotalNumbers() + "\nSorted data :" + sbs);
                    }
                    break;
                default:
                    System.out.println("word");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nullword");
        }
    }
}

