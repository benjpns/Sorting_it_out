package sorting;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String dtypeUser = "WORD";
        String stypeUser = "NATURAL";
        String bycount = "BYCOUNT";
        EnumDtypes datatype;
        Sorttype sorttype;
        Parametermap map= new Parametermap(args);;
        try {
            dtypeUser = map.userinputs.getOrDefault("-dataType", dtypeUser).toUpperCase(Locale.ROOT);
            stypeUser = map.userinputs.getOrDefault("-sortingType", stypeUser).toUpperCase(Locale.ROOT);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
        Scanner scan = new Scanner(System.in);
        switch (dtypeUser) {
            case "LINE":
                datatype = EnumDtypes.LINE;
                break;
            case "LONG":
                datatype = EnumDtypes.LONG;
                break;
            case "WORD":
            default:
                datatype = EnumDtypes.WORD;
                break;
        }
        switch (stypeUser) {
            case "BYCOUNT":
                sorttype = Sorttype.BYCOUNT;
                break;
            case "NATURAL":
            default:
                sorttype = Sorttype.NATURAL;
                break;
        }


        SortData<Long> longs = null;
        SortData<String> strings = null;
        switch (datatype) {
            case LONG:
                List<Long> numbers = new ArrayList<>();
                while (scan.hasNext()) {
                    long number = scan.nextLong();
                    numbers.add(number);
                }
                longs = new SortData<>();
                longs.Compute(numbers);
                if (!sorttype.toString().equals(bycount)) {
                    System.out.println(longs.number());
                    longs.print();
                }
                if (!sorttype.toString().equals("NATURAL")){
                    Bycount bycunt = new Bycount();
                    bycunt.Compute(numbers);
                    bycunt.print();
                }
                break;
            case LINE:
                List<String> line = new ArrayList<>();
                while (scan.hasNextLine()) {
                    String string = scan.nextLine();
                    line.add(string);
                }
                if (!sorttype.toString().equals(bycount)){
                    Line ln = new Line();
                    ln.Compute(line);
                    System.out.println(ln.line());
                    ln.newLine(); ln.print();
                }

                break;
            case WORD:
            default:
                List<String> word = new ArrayList<>();
                while (scan.hasNext()) {
                    String string = scan.next();
                    word.add(string);
                }

                strings = new SortData<>();
                strings.Compute(word);
                System.out.println(strings.word());
                strings.print();
                break;
        }



    }
}












