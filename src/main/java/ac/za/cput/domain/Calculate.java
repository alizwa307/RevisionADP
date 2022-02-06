/*
 *@author Kegomoditswe Leshope (219189048)
 * 6 February 2022
 * Revision Exercise - Software Development Infrastructure
 */
package ac.za.cput.domain;

public class Calculate {
    public static int integerDivision( int numerator, int denominator) {
        if (denominator < 1) return 0;
        return numerator / denominator;
    }
}
