import java.util.*;
class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int c = 2;
        int d = 12;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.print(arr[n-2]);
    }
}
