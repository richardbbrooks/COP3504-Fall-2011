public class ComplexNumber {
    private float real;
    private float imaginary;

    public ComplexNumber() {
        this.setReal((float) 0);
        this.setImaginary((float) 0);
    }
    public ComplexNumber(float realN, float imagN) {
        this.setReal(realN);
        this.setImaginary(imagN);
    }
    
    public float getReal() {
        return real;
    }
    public float getImaginary() {
        return imaginary;
    }
    
    //Changed from the specified int as parameter type because illogical specificaiton
    public void setReal(float realN) {
        real = realN;
    }
    //Changed from the specified int as parameter type because illogical specification
    public void setImaginary(float imagN) {
        imaginary = imagN;
    }
    
    private ComplexNumber perform(String operation, ComplexNumber comNum) {
        
        if (operation.equals("add")) {
            float a = this.getReal();
            float b = this.getImaginary();
            float c = comNum.getReal();
            float d = comNum.getImaginary();
            
            ComplexNumber result = new ComplexNumber((a+c), (b+d));
            
            return result;
        } else if (operation.equals("sub")) {
            float a = this.getReal();
            float b = this.getImaginary();
            float c = comNum.getReal();
            float d = comNum.getImaginary();
            
            ComplexNumber result = new ComplexNumber((a-c), (b-d));
            return result;
        } else if (operation.equals("mult")) {
            float a = this.getReal();
            float b = this.getImaginary();
            float c = comNum.getReal();
            float d = comNum.getImaginary();

            float realPart = (a*c)-(b*d);
            float imagPart = (b*c)+(a*d);
            ComplexNumber result = new ComplexNumber(realPart, imagPart);
            
            return result;
        } else if (operation.equals("div")) {
            float a = this.getReal();
            float b = this.getImaginary();
            float c = comNum.getReal();
            float d = comNum.getImaginary();
            
            float realPart = ((a*c) + (b*d)) / ((c*c) + (d*d));
            float imagPart = ((b*c) - (a*d)) / ((c*c) + (d*d));
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
        if (imaginary >= 0) {
            return (real + "+" + imaginary + "i");
        } else {
            return (real + "" + imaginary + "i");
        }
    }
}
