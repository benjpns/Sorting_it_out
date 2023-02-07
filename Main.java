package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        String argtype = "";
        Datatype datatype;

        try {
            if (args[0].equals("-sortIntegers")){
                argtype = args[0].toUpperCase(Locale.ROOT).replace("-", "");
            } else if (args[0].equals("-dataType") && args.length < 3){
                argtype = args[1].toUpperCase(Locale.ROOT).replace("-", "");
            } else if (args[0].equals("-dataType") && args[2].equals("-sortIntegers")){
                argtype = args[2].toUpperCase(Locale.ROOT).replace("-", "");
            }

        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        switch (argtype) {
            case "SORTINTEGERS":
                datatype = Datatype.SORT;
                break;
            case "LINE":
                datatype = Datatype.LINE;
                break;
            case "LONG":
                datatype = Datatype.LONG;
                break;
            case "WORD":
            default:
                datatype = Datatype.WORD;
                break;
        }

        Scanner scan = new Scanner(System.in);
        switch (datatype) {
            case SORT:
                List<Integer> sortNum = new ArrayList<>();
                while (scan.hasNextInt()){
                    int number = scan.nextInt();
                    sortNum.add(number);
                }
                SortInt srt = new SortInt();
                srt.Compute(sortNum); srt.printd();
                break;
            case LONG:
                List<Long> numbers = new ArrayList<>();
                while (scan.hasNext()) {
                    long number = scan.nextLong();
                    numbers.add(number);
                }
                Longs ln = new Longs();
                ln.Compute(numbers); ln.printd();
                break;
            case LINE:
                List<String> line = new ArrayList<>();
                while (scan.hasNextLine()) {
                    String string = scan.nextLine();
                    line.add(string);
                }
                Line lin = new Line();
                lin.Compute(line);
                lin.printd();
                break;
            case WORD:
            default:
                List<String> word = new ArrayList<>();
                while (scan.hasNext()) {
                    String string = scan.next();
                    word.add(string);
                }
                Word wr = new Word();
                wr.Compute(word);
                wr.printd();
                break;
        }
    }

}







