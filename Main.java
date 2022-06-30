package sorting;

import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runTimeParameter(args);
        getUserInput();
    }
    public static void runTimeParameter(String[] args){

       String mainMenu = args[0].toUpperCase(Locale.ROOT);
       try {
           switch (mainMenu){
               case "DATATYPE":
                   Runtime type = Runtime.DATATYPE;
                   System.out.println(type.getLine().equals(args[1]) ||
                                      type.getWord().equals(args[1]) ||
                                      type.getLongs().equals(args[1]) ?
                           args[1]: "Check runtime parameter typo."); //apply method argument here
                   break;
               case "SORTINTEGER":
                   Runtime sort = Runtime.SORTINTEGER;
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

    public static void getUserInput(){
        Scanner input = new Scanner(System.in);

    }
}