package sorting;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        processAndPrint(runTimeParameter(args));

    }
    public static String runTimeParameter(String[] args) {
        String oneLineMenu = "";
        StringBuilder menuMerge = new StringBuilder();
        for (String s: args){
            menuMerge.append(s);
        }
        oneLineMenu = String.valueOf(menuMerge).toUpperCase(Locale.ROOT).replaceAll("-","");
        return oneLineMenu;
    }

    public static void processAndPrint(String oneLineMenu){
        Type type = new Type(oneLineMenu);
        System.out.println(type.toString(oneLineMenu));
    }

    public static void validateUserArgs(String oneLineMenu){
        Runtime enumType = Runtime.valueOf(oneLineMenu);

    }
}
