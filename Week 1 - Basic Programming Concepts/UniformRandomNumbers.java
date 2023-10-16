/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double r0 = Math.random();
        double r1 = Math.random();
        double r2 = Math.random();
        double r3 = Math.random();
        double r4 = Math.random();
        // calculate average value of random numbers
        double averageValue = (r0 + r1 + r2 + r3 + r4) / 5;
        // find max value of random numbers
        double max = Math.max(Math.max(Math.max(Math.max(r0, r1), r2), r3), r4);
        // double maxZeroOne = Math.max(r0, r1);
        // double maxOneTwo = Math.max(maxZeroOne, r2);
        // double maxTwoThree = Math.max(maxOneTwo, r3);
        // double maxThreeFour = Math.max(maxTwoThree, r4);
        // find min value of random numbers
        double min = Math.min(Math.min(Math.min(Math.min(r0, r1), r2), r3), r4);
        // double minZeroOne = Math.min(r0, r1);
        // double minOneTwo = Math.min(minZeroOne, r2);
        // double minTwoThree = Math.min(minOneTwo, r3);
        // double minThreeFour = Math.min(minTwoThree, r4);

        System.out.println("First random number: " + r0);
        System.out.println("Second random number: " + r1);
        System.out.println("Third random number: " + r2);
        System.out.println("Fourth random number: " + r3);
        System.out.println("Fifth random number: " + r4);
        System.out.println("Average value of all random numbers: " + averageValue);
        System.out.println("Maximum value of random numbers: " + max);
        System.out.println("Minimum value of random numbers: " + min);
    }
}
