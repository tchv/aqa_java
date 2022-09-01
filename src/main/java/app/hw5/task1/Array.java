package app.hw5.task1;

public class Array {
    static void printArray(int[] arr, int num) {
        System.out.println("\n================================[ ARRAY PROGRAM ]================================");

        for (int i = 0; i < num; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                System.out.print("[\t" + arr[i] + "\t]");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -1, -23, -43, -25, 56, 78, 94, 23, 12, 7 } ;

        int num = arr.length;
        printArray(arr, num);

        System.out.println("\n=================================== * START * ===================================");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\nThe number with the maximum value in the array:\n>>> " + max);

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("\nThe sum of all the numbers in the array:\n>>> " + sum);

        int positive = 0;
        for (int i : arr) {
            if (i >= 0) {
                positive++;
            }
        }
        System.out.println("\nTotal number of digits with a positive value:\n>>> " + positive);

        int negative = 0;
        for (int i : arr) {
            if (i < 0) {
                negative++;
            }
        }
        System.out.println("\nTotal number of digits with a negative value:\n>>> " + negative);

        if (positive > negative) {
            System.out.println("\n\t[ Info ] There are more positive numbers in the array!");
        } else if (positive == negative) {
            System.out.println("\n\t[ Info ] The array contains the same number of positive and negative numbers!");
        } else {
            System.out.println("\n\t[ Info ] There are more negative numbers in the array!");
        }
        System.out.println("\n==================================== * END * ====================================");
    }
}
