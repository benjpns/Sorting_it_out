package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Parametermap {
    static ArrayList<String> unwanted = new ArrayList<>();
    HashMap<String, String> userinputs;
    public Parametermap(String[] argtype) throws ArrayIndexOutOfBoundsException{
        userinputs = new HashMap<>();

        try {
            for (int i = 0; i < argtype.length; i+=2){
                userinputs.put(argtype[i], argtype[i + 1]);
            }
            unwanteds(argtype);
        } catch (ArrayIndexOutOfBoundsException e){
            //Error handling "SortingType"  "SortingType natural Datatype" and unknown parameters
           for (String s : argtype){
               if (s.equals("-sortingType") && userinputs.size()==0){
               System.out.println("No sorting type is defined!");
               System.exit(1);
               }
               if (s.equals("-dataType") && userinputs.size()==1){
                   System.out.println("No data type is defined!");
                   System.exit(1);
               }
           }

            unwanteds(argtype);
        }

    }
    private static void unwanteds(String[] argtype) {
        if (argtype.length > 3){
           int args = argtype.length - 1 - 3;
            for (int i = 0; i < args;){
                i++;
                unwanted.add(argtype[3 + i]);
            }
        }
       for (String s : unwanted){
           System.out.printf("\"%s\" is not a valid parameter. It will be skipped.\n", s);
       }
    }
}
