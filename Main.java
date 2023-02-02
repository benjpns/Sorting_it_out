package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
        }
    }
}
