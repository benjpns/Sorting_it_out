package sorting;
import java.util.Map;
import java.util.TreeMap;

public class Parametermap {
    Map<String, String> userinputs;
    public Parametermap(String[] argtype){
        userinputs = new TreeMap<>();
      for (int i = 0; i < argtype.length; i+=2){
          userinputs.put(argtype[i], argtype[i + 1]);
      }

    }
}
