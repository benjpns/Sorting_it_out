package sorting;
import java.util.HashMap;
public class Parametermap {
    HashMap<String, String> userinputs;
    public Parametermap(String[] argtype){
        userinputs = new HashMap<>();
      for (int i = 0; i < argtype.length; i+=2){
          userinputs.put(argtype[i], argtype[i + 1]);
      }

    }
}
