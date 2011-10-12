public class DriverComplexNumber {
    public static void main(String[] args) {
        ComplexNumber A = new ComplexNumber(2,3);
        ComplexNumber B = new ComplexNumber(1,4);

        System.out.println("CASE 1 ADD:  " + A.addComplex(B).toString().equals("3.0+7.0i"));
        System.out.println("CASE 1 SUB:  " + A.subComplex(B).toString().equals("1.0-1.0i"));
        System.out.println("CASE 1 MULT: " + A.multComplex(B).toString().equals("-10.0+11.0i"));
        System.out.println("CASE 1 DIV: " + A.divComplex(B).toString().equals("0.8235294-0.29411766i"));
        System.out.println("CASE 1 MAG A: " + (A.magComplex() == (float)3.6055512));
        System.out.println("CASE 1 MAG B: " + (B.magComplex() == (float)4.1231055));
        System.out.println();
    }
}
