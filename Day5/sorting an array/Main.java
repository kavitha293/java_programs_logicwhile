import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
    public static void halfSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < (n/2)-1 ; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int j = n/2; j < n-i-1 ; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = s.nextInt();
        //sort(arr);
        halfSort(arr);
    }
}