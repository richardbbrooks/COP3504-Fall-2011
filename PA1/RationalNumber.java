public class RationalNumber {
    private int numerator;
    private int denominator;

    /*
     * This class may or may not have odd results in situations where
     * the numerator and/or denominator are equal to zero and a math
     * operation is performed.
     *
     * The specification did not state the desired behavior
     * of the class in these situations.
     */

    public RationalNumber() {
        this.setNumerator((int) 0);
        this.setDenominator((int) 0);
    }
    public RationalNumber(int numer, int denom) {
        //Set numerator before denominator so that
        //we assign sign properly.
        this.setNumerator(numer);
        this.setDenominator(denom);
    }
    
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int numer) {
        numerator = numer;
    }
    public void setDenominator(int denom) {
        if (denom < 0 && this.getNumerator() != 0) {
            denom *= -1;//Sign change denominator
            this.setNumerator(this.getNumerator() * -1);//Sign change numerator
        }
        denominator = denom;
    }
    
    /* 
     * This method was kept as private to minimize the ability for
     * a programmer error when using this class. 
     *
     * By preventing the direct access of the perform() method a
     * programmer cannot pass an invalid operation parameter.
     * The add/sub/mult/div-Rational methods allow for the public
     * manipulation of RationalNumber objects.
     *
     * See the example driver program for clarification. 
     */
    private RationalNumber perform(String operation, RationalNumber ratNum) {
        
        if (operation.equals("add")) {
            int a = numerator * ratNum.getDenominator();
            int b = denominator * ratNum.getNumerator();
            int c = denominator * ratNum.getDenominator();

            RationalNumber result = new RationalNumber(a+b, c);
            return result;
        } else if (operation.equals("sub")) {
            int a = numerator * ratNum.getDenominator();
            int b = denominator * ratNum.getNumerator();
            int c = denominator * ratNum.getDenominator();

            RationalNumber result = new RationalNumber(a-b, c);
            return result;
        } else if (operation.equals("mult")) {
            int a = numerator * ratNum.getNumerator();
            int b = denominator * ratNum.getDenominator();

            RationalNumber result = new RationalNumber(a, b);
            return result;
        } else if (operation.equals("div")) {
            int a = numerator * ratNum.getDenominator();
            int b = denominator * ratNum.getNumerator();

            RationalNumber result = new RationalNumber(a, b);
            return result;
        } else {
            System.out.println("0/0");
            return (new RationalNumber(0,0));
        }
    }
    public RationalNumber addRational(RationalNumber ratNum) {
        return (this.perform("add", ratNum));
    }
    public RationalNumber subRational(RationalNumber ratNum) {
        return (this.perform("sub", ratNum));
    }
    public RationalNumber multRational(RationalNumber ratNum) {
        return (this.perform("mult", ratNum));
    }
    public RationalNumber divRational(RationalNumber ratNum) {
        return (this.perform("div", ratNum));
    }
    @Override public String toString() {
        //We can do this because we attempt to ensure that
        //the numerator carries the sign for the RationalNumber
        return (numerator + "/" + denominator);
    }
}
