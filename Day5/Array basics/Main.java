import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void elementBased(int n, int[] a) {
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                evenSum += a[i];
            else
                oddSum += a[i];
        }
        System.out.println("Element Base:");
        System.out.println(oddSum - evenSum);
    }

    public static void indexBased(int n, int[] a) {
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0)
                evenSum += a[i];
            else
                oddSum += a[i];
        }
        System.out.println("Index Base:");
        System.out.println(evenSum - oddSum);
    }

    public static boolean mirror(int[] a) {
        int n = a.length;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n - 1 - i])
                    return false;
            }
        } else
            return false;
        return true;
    }

    // public static boolean arraysEqual(int[] a, int[] b) {
    // if (a.length != b.length)
    // return false;
    // int len = a.length;
    // for (int i = 0; i < len; i++) {
    // if (a[i] != b[i])
    // return false;
    // }
    // return true;
    // }
    public static String arraysEqual(int[] a, int[] b) {
        int len = a.length;
        int[] freq = new int[10];
        for(int val : a){
            freq[val]++;
        }
        for(int val : b){
            freq[val]--;
        }
        for(int val : freq){
            if(val != 0)
                return "Not equal";
        }
        return "Equal";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // int m = s.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        s.close();
        // elementBased(size, a);
        // indexBased(size, a);
        // System.out.println(mirror(a) ? "Mirror Array" : "Not a Mirror Array");
        // System.out.println(arraysEqual(a, b) ? "Equal" : "Not Equal");
        // System.out.println(Arrays.toString(a).equals(Arrays.toString(b)));
        System.out.println(arraysEqual(a, b));
    }
}