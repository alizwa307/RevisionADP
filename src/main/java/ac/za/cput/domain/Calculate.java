package ac.za.cput.domain;

public class Calculate {
    public static int integerDivision( int numerator, int denominator) {
        if (denominator < 1) return 0;
        return numerator / denominator;
    }
}
