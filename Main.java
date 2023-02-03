package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.*;

enum Selection {
    LONG, LINE, WORD
}
public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select = "";
        Selection selection;
        try {
            select = args[1].toUpperCase(Locale.ROOT);
            selection = Selection.valueOf(select);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException s) {
            selection = Selection.WORD;
        }

        if (select.equals("LINE")) {
            ArrayList<String> sList = getStrings(scanner);
            if (selection == Selection.LINE) {
                new Line(sList);
            }
        } else {
            ArrayList<Long> list = getLongs(scanner);
            switch (selection) {
                case WORD:
                    try {
                        new Word(list);
                    } catch (NoSuchElementException e){
                        ArrayList<String> stringList = getStringList(scanner);
                        new Word(stringList, "Missmatch");
                    }

                    break;
                case LONG:
                    new Integer(list);
                    break;
            }
        }
    }



    @NotNull
    private static ArrayList<Long> getLongs(Scanner scanner) {
        ArrayList<Long> list = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            // write your code here
            list.add(number);
        }
        return list;
    }
    @NotNull
    private static ArrayList<String> getStrings(Scanner scanner) {
        ArrayList<String> sList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            // write your code here
            sList.add(number);
        }
        return sList;
    }
    @NotNull
    private static ArrayList<String> getStringList(Scanner scanner) {
        ArrayList<String> getStringList = new ArrayList<>();
        while (scanner.hasNext()) {
            String number = scanner.next();
            // write your code here
            getStringList.add(number);
        }
        return getStringList;
    }
}

class PrimaryNumero {
    protected static long words;
    protected static int percentage;
    protected static long large;
    protected static String bigString;
    protected int duplicate;
    protected ArrayList<Long> list;
    protected ArrayList <String> stringList;
    protected ArrayList<java.lang.Integer> bigInt;

    PrimaryNumero(@NotNull ArrayList<Long> list){
        this.list = list;
        words = list.size();
        large = Collections.max(list);
        duplicate = Collections.frequency(list, large);
        percentage = percentage(words, duplicate);

    }

    PrimaryNumero(@NotNull ArrayList<String> stringList, String missMatch){
        String miss = missMatch;
        this.stringList = stringList;
        words = stringList.size();
        bigInt = new ArrayList<>();
        for (String s : stringList) {
            bigInt.add(s.length());
        }
        bigString = stringList.get(bigInt.indexOf(Collections.max(bigInt)));
        duplicate = Collections.frequency(stringList, bigString);
        percentage = percentage(words, duplicate);
    }

    public static int percentage (long elements, int duplicate){
        double percent = (duplicate/(double) elements) * 100;
        return (int)percent;
    }

}

class Word extends PrimaryNumero {
    Word(ArrayList<Long> list) {
        super(list);
        System.out.printf("Total words: %d\nThe longest word: %d (%d time(s), %d%%)", words, large, duplicate, percentage);
    }
    Word(ArrayList<String> stringList, String missMatch) {
        super(stringList, missMatch);
        System.out.printf("Total words: %d\nThe longest word: %s (%d time(s), %d%%)", words, bigString, duplicate, percentage);
    }

}

class Integer extends PrimaryNumero {
    Integer(ArrayList<Long> list) {
        super(list);
        System.out.printf("Total numbers: %d\nThe longest number: %d (%d time(s), %d%%)", words, large, duplicate, percentage);
    }
}
class Line extends PrimaryNumero {
    public int line;
    public int duplicate;
    public int percentage;
    Line(@NotNull ArrayList<String> sList) {
        super(sList, "missmatch");
        this.line = sList.size();
        for (String s : stringList) {
            bigInt.add(s.length());
        }
        bigString = stringList.get(bigInt.indexOf(Collections.max(bigInt)));
        duplicate = Collections.frequency(sList, bigString);
        percentage = PrimaryNumero.percentage(line, duplicate);
        System.out.printf("Total lines: %d\nThe longest line: \n%s\n(%d time(s), %d%%)", line, bigString, duplicate, percentage);
    }


}


