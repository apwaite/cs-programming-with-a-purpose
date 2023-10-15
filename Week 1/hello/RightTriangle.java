/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);
        boolean isPositive;
        boolean isRightTriangle;

        // check all int arguments entered are positive and greater than 0
        isPositive = a >= 0 && a != 0 && b >= 0 && b != 0 && c >= 0 && c != 0;

        // does a squared + b squared = c squared
        isRightTriangle = (a * a) + (b * b) == (c * c) && isPositive;

        // OR does a squared + c squared = b squared
        isRightTriangle = isRightTriangle || (a * a) + (c * c) == (b * b) && isPositive;

        // OR does b squared + c squared = a squared
        isRightTriangle = isRightTriangle || (b * b) + (c * c) == (a * a) && isPositive;
        
        System.out.println(isRightTriangle);
    }
}
