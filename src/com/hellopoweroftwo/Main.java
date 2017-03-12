package com.hellopoweroftwo;

import java.util.Scanner;

import static com.common.math.MathHelper.*;

public class Main {

    private static final String INPUT_PROMPT_FORMAT = "Input any integer in range from %d to %d, or type '%s' to exit.";

    private static final String INPUT_PROMPT_SAMPLES_FORMAT = "Examples: '0', '%s', '0 1', '0 1 2 %1$s'.";

    private static final String EXIT_COMMAND = "Exit";

    private static final String IS_POWER_OF_TWO_FORMAT = "Number '%d' is a power of two.";

    private static final String IS_NOT_POWER_OF_TWO_FORMAT = "Number '%d' is not a power of two.";

    public static void main(String[] args) {

        System.out.println("Hello, PowerOfTwo!");
        System.out.println(String.format(INPUT_PROMPT_FORMAT, 0, Integer.MAX_VALUE, EXIT_COMMAND));
        System.out.println(String.format(INPUT_PROMPT_SAMPLES_FORMAT, EXIT_COMMAND));

        try (Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNext()) {

                if (scanner.hasNextInt()) {

                    int number = scanner.nextInt();
                    if (number < 0) continue;

                    String output = String.format(isPowerOfTwo(number) ? IS_POWER_OF_TWO_FORMAT : IS_NOT_POWER_OF_TWO_FORMAT, number);
                    System.out.println(output);

                } else {

                    String input = scanner.next();
                    if (input.trim().equalsIgnoreCase(EXIT_COMMAND)) break;

                }

            }

        }

    }

}
