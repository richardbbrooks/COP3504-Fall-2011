public class DriverComplexNumber {
    public static void main(String[] args) {
        ComplexNumber A = new ComplexNumber(2,3);
        ComplexNumber B = new ComplexNumber(1,4);

        System.out.println("Add  result: " + A.addComplex(B).toString());
        System.out.println("Sub  result: " + A.subComplex(B).toString());
        System.out.println("Mult result: " + A.multComplex(B).toString());
        System.out.println("Div  result: " + A.divComplex(B).toString());
        System.out.println("A Mag: " + A.magComplex());
        System.out.println("B Mag: " + B.magComplex());

    }
}
