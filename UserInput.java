package sorting;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    ArrayList<String> input = new ArrayList<>();

    public void UInput(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            input.add(scanner.next());
        }
    }

}
