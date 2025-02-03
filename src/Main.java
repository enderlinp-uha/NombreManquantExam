import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 6 };
        System.out.println("Entrée : " + Arrays.toString(numbers));
        System.out.println("Sortie : " + findMissingNumber(numbers) + "\n");

        int[] numbers2 = { 2, 3, 1, 5 };
        System.out.println("Entrée : " + Arrays.toString(numbers2));
        System.out.println("Sortie : " + findMissingNumber(numbers2) + "\n");

        int[] numbers3 = { 1, 2, 3, 4, 5 };
        System.out.println("Entrée : " + Arrays.toString(numbers3));
        System.out.println("Sortie : " + findMissingNumber(numbers3));
    }

    public static int findMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                if (numbers[i + 1] - numbers[i] > 1) {
                    return numbers[i] + 1;
                }
            }
        }
        return -1;
    }
}