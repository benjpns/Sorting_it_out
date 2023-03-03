package sorting;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String dtypeUser = "WORD";
        String stypeUser = "NATURAL";
        String bycount = "BYCOUNT";
        EnumDtypes datatype;
        Sorttype sorttype;
        Parametermap map= new Parametermap(args);
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


        SortData<Long> longs;
        SortData<String> strings;
        Bycount<Long> bynum;
        Bycount<String> bystring;

        switch (datatype) {
            case LONG:
                List<Long> numbers = new ArrayList<>();
                while (scan.hasNext()) {
                    try {
                        long number = scan.nextLong();
                        numbers.add(number);
                    } catch (InputMismatchException e){
                        System.out.println("\"" + scan.next() + "\" is not a long. It will be skipped.");
                    }

                }
                longs = new SortData<>();
                longs.Compute(numbers);
                System.out.println(longs.number());
                if (!sorttype.toString().equals(bycount)) {
                    longs.print();
                }
                if (!sorttype.toString().equals("NATURAL")){
                    bynum = new Bycount<>();
                    bynum.Compute(numbers);
                    bynum.byCountPrint();
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
                if (!sorttype.toString().equals("NATURAL")){
                    bystring = new Bycount<>();
                    bystring.Compute(line);
                    System.out.println(bystring.line());
                    bystring.byCountPrint();
                }

                break;
            case WORD:
            default:
                List<String> word = new ArrayList<>();
                while (scan.hasNext()) {
                    String string = scan.next();
                    word.add(string);
                }
                if (!sorttype.toString().equals(bycount)) {
                    strings = new SortData<>();
                    strings.Compute(word);
                    System.out.println(strings.word());
                    strings.print();
                }
                if (!sorttype.toString().equals("NATURAL")){
                    bystring = new Bycount<>();
                    bystring.Compute(word);
                    System.out.println(bystring.word());
                    bystring.byCountPrint();
                }
                break;
        }



    }
}












