package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Natural {

    public Natural(Datatype datatype) {
        Scanner scan = new Scanner(System.in);
        //natural
        switch (datatype) {
            case LONG:
                List<Long> numbers = new ArrayList<>();
                while (scan.hasNext()) {
                    long number = scan.nextLong();
                    numbers.add(number);
                }
                Longs ln = new Longs();
                ln.Compute(numbers); ln.printd();
                break;
            case LINE:
                List<String> line = new ArrayList<>();
                while (scan.hasNextLine()) {
                    String string = scan.nextLine();
                    line.add(string);
                }
                Line lines = new Line();
                lines.Compute(line);
                lines.printd();
                break;
            case WORD:
            default:
                List<String> word = new ArrayList<>();
                while (scan.hasNext()) {
                    String string = scan.next();
                    word.add(string);
                }
                Word wrd = new Word();
                wrd.Compute(word);
                wrd.printd();
                break;
        }
    }
}
