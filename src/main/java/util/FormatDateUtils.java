package util;

public class FormatDateUtils {
    public static String minutesFromMS(final int ms) {
        return (ms / 1000) / 60 + ":" + (ms / 1000) % 60;
    }
}
