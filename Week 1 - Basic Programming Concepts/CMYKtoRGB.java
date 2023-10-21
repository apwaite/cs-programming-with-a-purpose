/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        // convert CMYK format to RGB with formula
        double white = 1 - k;
        double r = 255 * white * (1 - c);
        double g = 255 * white * (1 - m);
        double b = 255 * white * (1 - y);
        // round double value to closet integer value
        long red = Math.round(r);
        long green = Math.round(g);
        long blue = Math.round(b);

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}
