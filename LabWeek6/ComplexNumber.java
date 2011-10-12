public class ComplexNumber {
    private int real;
    private int imaginary;

    /*
     * This class may or may not have odd results in situations where
     * the real and/or imaginary are equal to zero and a math
     * operation is performed.
     *
     * The specification did not state the desired behavior
     * of the class in these situations.
     */

    public ComplexNumber() {
        this.setreal((int) 0);
        this.setimaginary((int) 0);
    }
    public ComplexNumber(int realN, int imagN) {
        this.setreal(realN);
        this.setimaginary(imagN);
    }
    
    public int getReal() {
        return real;
    }
    public int getImaginary() {
        return imaginary;
    }
    
    public void setreal(int realN) {
        real = realN;
    }
    public void setimaginary(int imagN) {
        imaginary = imagN;
    }
    
    private ComplexNumber perform(String operation, ComplexNumber comNum) {
        
        if (operation.equals("add")) {
            int a = this.getReal();
            int b = this.getImaginary();
            int c = comNum.getReal();
            int d = comNum.getImaginary();
            
            ComplexNumber result = new ComplexNumber(
                    this.getReal()+comNum.getReal(),
                    this.getImaginary()+comNum.getImaginary());
            
            return result;
        } else if (operation.equals("sub")) {
            int a = this.getReal();
            int b = this.getImaginary();
            int c = comNum.getReal();
            int d = comNum.getImaginary();
            
            ComplexNumber result = new ComplexNumber(
                    this.getReal()-comNum.getReal(),
                    this.getImaginary()-comNum.getImaginary());
            
            return result;
        } else if (operation.equals("mult")) {
            int a = this.getReal();
            int b = this.getImaginary();
            int c = comNum.getReal();
            int d = comNum.getImaginary();

            int realPart = (a*c)-(b*d);
            int imagPart = (b*c)+(a*d);
            ComplexNumber result = new ComplexNumber(realPart, imagPart);
            
            return result;
        } else if (operation.equals("div")) {
            int a = this.getReal();
            int b = this.getImaginary();
            int c = comNum.getReal();
            int d = comNum.getImaginary();
            
            int realPart = ((a*c) + (b*d)) / ((c*c) + (d*d));
            int imagPart = ((b*c) - (a*d)) / ((c*c) + (d*d));
            ComplexNumber result = new ComplexNumber(realPart, imagPart);
            return result;
        } else {
            System.out.println("SHIT!");
            return (new ComplexNumber());
        }
    }
    public ComplexNumber addComplex(ComplexNumber comNum) {
        return (this.perform("add", comNum));
    }
    public ComplexNumber subComplex(ComplexNumber comNum) {
        return (this.perform("sub", comNum));
    }
    public ComplexNumber multComplex(ComplexNumber comNum) {
        return (this.perform("mult", comNum));
    }
    public ComplexNumber divComplex(ComplexNumber comNum) {
        return (this.perform("div", comNum));
    }
    public float magComplex() {
        return ((float) Math.sqrt(Math.pow(this.getReal(),2) + Math.pow(this.getImaginary(), 2)));
    }
    @Override public String toString() {
        //We can do this because we attempt to ensure that
        //the real carries the sign for the ComplexNumber
        return (real + "+" + imaginary + "i");
    }
}
