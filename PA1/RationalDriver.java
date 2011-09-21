public class RationalDriver {
    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(2,5);
        RationalNumber b = new RationalNumber(1,7);
        RationalNumber d = new RationalNumber();

        System.out.println(a.toString());
        System.out.println(b.toString());
        
        d = a.addRational(b);
        System.out.println(d.toString());
        d = a.subRational(b);
        System.out.println(d.toString());
        d = a.multRational(b);
        System.out.println(d.toString());
        d = a.divRational(b);
        System.out.println(d.toString());
        
    }
}
