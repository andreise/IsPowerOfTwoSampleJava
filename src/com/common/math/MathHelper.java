package com.common.math;

public final class MathHelper {

    private MathHelper() {
    }

    private final class Messages {

        private Messages() {
        }

        public static final String NON_NEGATIVE_VALUE_REQUIRED = "Value must be equals to or greater than zero.";

    }

    private static int decrementUnchecked(int value) {
        // Comment if package will be compiled in unchecked mode
        // Uncomment to implement unchecked operation anyway
        if (value == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        return value - 1;
    }

    private static long decrementUnchecked(long value) {
        // Comment if package will be compiled in unchecked mode
        // Uncomment to implement unchecked operation anyway
        if (value == Long.MIN_VALUE)
            return Long.MAX_VALUE;

        return value - 1;
    }

    public static boolean isPowerOfTwoUnsigned(int value) {
        return (value & decrementUnchecked(value)) == 0 && value != 0;
    }

    public static boolean isPowerOfTwoUnsigned(long value) {
        return (value & decrementUnchecked(value)) == 0 && value != 0;
    }

    public static boolean isPowerOfTwo(int value) {
        if (value < 0)
            throw new IllegalArgumentException(Messages.NON_NEGATIVE_VALUE_REQUIRED);

        return isPowerOfTwoUnsigned(value);
    }

    public static boolean isPowerOfTwo(long value) {
        if (value < 0)
            throw new IllegalArgumentException(Messages.NON_NEGATIVE_VALUE_REQUIRED);

        return isPowerOfTwoUnsigned(value);
    }

    public static boolean isPowerOfTwoSilent(int value) {
        return value > 0 && (value & value - 1) == 0;
    }

    public static boolean isPowerOfTwoSilent(long value) {
        return value > 0 && (value & value - 1) == 0;
    }

}
