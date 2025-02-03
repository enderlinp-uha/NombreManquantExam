import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 6 };
        System.out.println("Entrée : " + Arrays.toString(numbers));
        System.out.println("Sortie : " + findMissingNumber(numbers));

        System.out.println();

        int[] numbers2 = { 2, 3, 1, 5 };
        System.out.println("Entrée : " + Arrays.toString(numbers2));
        System.out.println("Sortie : " + findMissingNumber(numbers2));
    }

    public static int findMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int nextIndex = i + 1;
            if (numbers[i] > nextIndex) {
                return nextIndex;
            }
        }
        return -1;
    }
}