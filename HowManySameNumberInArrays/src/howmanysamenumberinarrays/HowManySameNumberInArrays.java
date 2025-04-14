package howmanysamenumberinarrays;

public class HowManySameNumberInArrays {

    public static void main(String[] args) {

        int[] numbers = {5, 7, 5, 8, 4, 5, 1, 6, 4, 5, 8, 4, 5};

        int searchElement = 4;

        System.out.println(getSameNumberInArrays(numbers, searchElement));

    }

    public static int getSameNumberInArrays(int[] numbers, int searchElement) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (searchElement == numbers[i]) {
                count++;
            }

        }
        return count;
    }

}
