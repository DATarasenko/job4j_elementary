package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result += symbol;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
                if (i == input.length() - 1) {
                    result += counter;
                }
            } else {
                if (counter == 1) {
                    result += input.charAt(i);

                } else {
                    result = result + counter + input.charAt(i);
                    counter = 1;
                }
            }
        }

        return result;
    }
}