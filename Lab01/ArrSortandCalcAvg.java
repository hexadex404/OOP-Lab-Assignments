import java.util.Arrays;
import java.util.Scanner;

public class ArrSortandCalcAvg {
    public static int[] sortArray(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] > sortedArr[i + 1]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        
        return sortedArr;
    }
    
    public static double calcSum(int[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static double calcAvg(int[] arr) {
        double sum = calcSum(arr);
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            System.out.print(" ");
        }
        
        int[] sortedArr = sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
        
        double sum = calcSum(arr);
        double avg = calcAvg(arr);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
        
        input.close();
    }
}
