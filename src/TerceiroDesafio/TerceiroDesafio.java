package TerceiroDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {

        int value;
        int arraySize;
        int pairs = 0;
        List<Integer> arrayList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        arraySize = input.nextInt();
        value = input.nextInt();

        for (int i = 0; i < arraySize; i++) {
            arrayList.add(input.nextInt());
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i != j) {
                    int difference = arrayList.get(i) - arrayList.get(j);
                    if (difference == value) {
                        pairs++;
                    }
                }
            }
        }

        System.out.println(pairs);
    }
}
