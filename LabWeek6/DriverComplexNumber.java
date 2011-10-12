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
        
        //Honestly, I'm done writing test cases for trivial programs and functions.
        //
        //When the amount of time I spend writing test cases and documentation
        //exceeds the amount of time it takes for me to write the program
        //and test by hand I can't help but notice the absurdity of this class.
        //
        //That absurdity is further magnified by this being the third assignment
        //in a row that is essentially identical to the previous assignment.
        //I change the names of the variables and methods, plus a few math
        //operations and I've got the program done.
        //
        //For an 'advanced' class I haven't learned anything advanced.
        //
        //I have not learned a single, godamn thing in this class. Normally I'm 
        //alright with this - I've come to expect it from my college classes. 
        //But, this time, I'm more pissed than normal. Now that I don't have
        //either 'Bright Futures' softening my tuition or any other scholarship
        //I'm paying entirely out of pocket.
        //
        //I'm upset that I'm not getting value for my education.
    }
}
