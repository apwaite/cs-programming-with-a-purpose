/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // determine max number
        int max = Math.max(Math.max(a, b), c);
        // determine min number
        int min = Math.min(Math.min(a, b), c);
        // determine middle number
        int mid = a + b + c - min - max;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
