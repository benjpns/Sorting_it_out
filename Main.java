package sorting;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        if (validateUserArgs(args[0], runTimeParameter(args))) {
            processAndPrint(runTimeParameter(args));
        } else {
            System.out.println("Something went wrong.");
        }
    }

    public static String runTimeParameter(String[] args) {
        if (args[0].equals("-sortIntegers")) {
            return "SORTINTEGERS";
        }
        String oneLineMenu;
        StringBuilder menuMerge = new StringBuilder();
        for (String s : args) {
            menuMerge.append(s);
        }
        oneLineMenu = String.valueOf(menuMerge).toUpperCase(Locale.ROOT).replaceAll("-", "");
        return oneLineMenu;
    }

    public static void processAndPrint(String oneLineMenu) {
        Type type = new Type(oneLineMenu);
        System.out.println(type.toString(oneLineMenu));
    }

    public static boolean validateUserArgs(String args, String oneLineMenu) {
        String stripArgs = args.toUpperCase(Locale.ROOT).replaceAll("-", "");
        Runtime enumType = Runtime.valueOf(stripArgs);
        ArrayList<String> enumArray = new ArrayList<>();
        enumArray.add(enumType.getLine());
        enumArray.add(enumType.getLongs());
        enumArray.add(enumType.getWord());
        enumArray.add(enumType.getLineSort());
        enumArray.add(enumType.getWordSort());
        enumArray.add(enumType.getLongSort());
        enumArray.add(enumType.getNa());
        //clear null values in enumArray list;
        while (enumArray.remove(null)) {

        }
        boolean pass = false;
        try {
            for (String s : enumArray) {
                pass = s.equals(oneLineMenu);
                if (pass) {
                    break;
                }
            }
            return pass;
        } catch (NullPointerException e) {
            return false;

        }

    }
}