package sorting;
import java.util.*;

public class Main {
    public static void main(final String[] args) throws Exception {
        String dtypeUser = "WORD";
        String stypeUser = "NATURAL";
        Sorttype sorttype;
        Datatype datatype = null;
        Parametermap map ;

        try {
            map = new Parametermap(args);
            dtypeUser = map.userinputs.getOrDefault("-dataType", dtypeUser).toUpperCase(Locale.ROOT);
            stypeUser = map.userinputs.getOrDefault("-sortType", stypeUser).toUpperCase(Locale.ROOT);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }

        switch (dtypeUser) {
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
        if (stypeUser.equals("BYCOUNT")){
            sorttype = Sorttype.BYCOUNT;
        } else {
            sorttype = Sorttype.NATURAL;
        }
        new Natural(datatype);

    }

}







