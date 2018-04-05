package chegg;

public class Fraction {
    int wholeNumber;
    int numerator;
    int denominator;
    Fraction() {
     this.numerator = 0;
     this.denominator = 1;
     wholeNumber = getWholeNumberPortion();
    }
    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
        wholeNumber = getWholeNumberPortion();
    }
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        wholeNumber = getWholeNumberPortion();
    }

    int getWholeNumberPortion() {
        return numerator/denominator;
    }

    Fraction(int wholeNumber, int numerator, int denominator) {
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int greatestCommonDenominator() {
        return gcd(numerator, denominator);
    }

    static int gcd(int numerator, int denominator)
    {
        if (numerator == 0 || denominator == 0)
            return 0;

        if (numerator == denominator)
            return numerator;

        if (numerator > denominator)
            return gcd(numerator-denominator, denominator);
        return gcd(numerator, denominator-numerator);
    }

    float getFraction () {
        return (float)numerator/(float)denominator;
    }

    String reduceFraction() {
        int gcd = greatestCommonDenominator();
        int num = numerator/gcd;
        int den = denominator/gcd;
        return  num + "/" + den;
    }

    String getFractionValue() {
        if(wholeNumber>0) {
            String fraction = wholeNumber + " ";
            if(numerator%denominator == 0) {
                return fraction;
            }
            int value = numerator%denominator;
            return fraction + value + "/" + denominator;

        } if(wholeNumber == 0 && getFraction() == 0) {
            return "0";
        }
        return reduceFraction();
    }

}
