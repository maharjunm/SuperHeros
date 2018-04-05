package chegg;

public class Example {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        System.out.println("Fraction Value in floating points");
        System.out.println(fraction.getFraction());
        System.out.println("the value as a fraction");
        System.out.println(fraction.getFractionValue());
        Fraction fraction1 = new Fraction(2);
        System.out.println("Fraction Value in floating points");
        System.out.println(fraction1.getFraction());
        System.out.println("the value as a fraction");
        System.out.println(fraction1.getFractionValue());
        Fraction fraction2 = new Fraction(3,2);
        System.out.println("Fraction Value in floating points");
        System.out.println(fraction2.getFraction());
        System.out.println("the value as a fraction");
        System.out.println(fraction2.getFractionValue());
        Fraction fraction3 = new Fraction(5,3);
        System.out.println("Fraction Value in floating points");
        System.out.println(fraction3.getFraction());
        System.out.println("the value as a fraction");
        System.out.println(fraction3.getFractionValue());
        Fraction fraction4 = new Fraction(4,7,5);
        System.out.println("Fraction Value in floating points");
        System.out.println(fraction4.getFraction());
        System.out.println("the value as a fraction");
        System.out.println(fraction4.getFractionValue());
    }
}
