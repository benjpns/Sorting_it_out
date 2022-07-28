package sorting;
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
            //UPDARE FRM MAC
            matchSort = type.getSort().equals(args[1]);
        }

        try {
            switch (mainMenu) {
                case "XDATATYPE":
                    if (matchEnum) {
                        Type stype = new Type(args[1]);
                        System.out.println(stype.toString(args[1]));
                    } else {
                        System.out.println("Check runtime parameter typo.");
                    }
                    break;
                case "SORTINGTOOL":
                  if (matchSort) {
                      Type stype = new Type(args[1]);
                      System.out.println(stype.toString(args[1]));
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

