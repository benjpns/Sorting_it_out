package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput <T>{

    ArrayList<T> input = new ArrayList<>();


    //recursion
    public UserInput(String sortType){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            input.add((T) scanner.next());
        }

    }



}
