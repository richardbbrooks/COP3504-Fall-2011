public class RationalDriver {
    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(2,-5);
        RationalNumber b = new RationalNumber(10,4);
        RationalNumber c = new RationalNumber();

        System.out.println("Rational 1: " + a.toString());
        System.out.println("Rational 2: " + b.toString());
        
        c = a.addRational(b);
        System.out.println("r1+r2: " + c.toString());
        c = a.subRational(b);
        System.out.println("r1-r2: " + c.toString());
        c = a.multRational(b);
        System.out.println("r1*r2: " + c.toString());
        c = a.divRational(b);
        System.out.println("r1/r2: " + c.toString());
        
    }
}
