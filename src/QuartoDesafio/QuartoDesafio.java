package QuartoDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {

        List<String> text = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int testNumber = input.nextInt();
        input.nextLine();

        for (int i = 0; i < testNumber; i++) {
            text.add(input.nextLine());
        }

        for (int i = 0; i < testNumber; i++) {

            String phrases = text.get(i).toString();
            int splitNumber = phrases.length() / 2;

            String part1 = text.get(i).substring(0, splitNumber);
            String part2 = text.get(i).substring(splitNumber, phrases.length());

            String correctText = (reverterString(part1).concat(reverterString(part2)));

            System.out.println(correctText);
        }
    }

    static String reverterString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
