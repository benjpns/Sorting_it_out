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

        long max = Collections.max(numbers);
        int maxFrequency = Collections.frequency(numbers, max);

        System.out.println("Total numbers: " + numbers.size());
        System.out.printf("The greatest number: %d (%d time(s))", max, maxFrequency);
    }
}
