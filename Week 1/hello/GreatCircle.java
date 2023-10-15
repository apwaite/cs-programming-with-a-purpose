/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double distance;
        // earth radius in km
        double earthRadius = 6371.0;

        // convert x2-x1 and y2-x1 values from degrees to radians
        double xVal = Math.toRadians((x2 - x1));
        double yVal = Math.toRadians((y2 - y1));

        // convert x1 and x2 values from degrees to radians for use in cos later
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

        // calculate sin portion of formula squared
        double xSin = Math.pow(Math.sin(xVal / 2), 2);
        double ySin = Math.pow(Math.sin(yVal / 2), 2);

        // calculate final distance
        distance = 2 * earthRadius * Math.asin(
                Math.sqrt((xSin) + Math.cos(x1) * Math.cos(x2) * (ySin)));

        System.out.println(distance + " kilometers");
    }
}
