package sorting;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        runTimeParameter(args);
    }
    public static void runTimeParameter(String[] args){
       String mainMenu = args[0].toUpperCase(Locale.ROOT);
        Runtime type = Runtime.DATATYPE;
        boolean matchEnum = type.getLine().equals(args[1]) ||
                type.getWord().equals(args[1]) ||
                type.getLongs().equals(args[1]);
        UserInput ui = new UserInput();
        ui.UInput();
        SortInterface sInterface = new SortInterface() {
            @Override
            public void TotalNumbers() {
                System.out.println("Total numbers: " + ui.input.size());
            }

            @Override
            public void sortInteger() {
                System.out.println("Total numbers: " + ui.input.size());
                Collections.sort(ui.input);
                String stringLIst = ui.input.toString();
                System.out.println("Sorted data: " + stringLIst);

            }
        };
       try {
           switch (mainMenu){

               case "DATATYPE":
                   if (matchEnum){
                      sInterface.sortInteger();
                   } else {
                       System.out.println("Check runtime parameter typo.");
                   }
                   break;
               case "SORTINGTOOL":
                   Runtime sort = Runtime.SORTINGTOOL;
                   System.out.println(sort.type(args[1]));
                   break;
               default:
                   System.out.println("word");
                   break;
           }
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("nullword");
       }
    }


}

