public class RationalNumber {
    private int numerator;
    private int denominator;

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
        if (denom < 0) {
            denom *= -1;
            this.setNumerator(this.getNumerator() * -1);
        }
        denominator = denom;
    }
    
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
        return (numerator + "/" + denominator);
    }
}
