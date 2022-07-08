package sorting;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    ArrayList<Integer> input = new ArrayList<>();
    public  UserInput(){
        Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                input.add(scanner.nextInt());
            }
    }

}
