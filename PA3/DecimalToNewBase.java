public class DecimalToNewBase {
    private int decimal;

    public DecimalToNewBase(int num) {
        decimal = num;
    }

    public String DecToN(int base) {
        //EXTRA CREDIT
        return "";
    }

    private String performBaseConversion(int p_base, int quotient, int remainder, String p_result) {
        //Complicated
        return "";
    }

    public String decToBaseTwo() {
        return (decToBaseTwo(decimal / 2, decimal % 2));    
    }
    private String decToBaseTwo(int quotient, int remainder) {
        String result = "";
        //System.out.println("fuck: " + quotient + " | " + remainder);
        if (quotient < 1) {
            //System.out.println("break: " + quotient + " | " + remainder);
            return String.valueOf(remainder);
        } else {
            result = decToBaseTwo(quotient / 2, quotient % 2) + String.valueOf(remainder);
            //System.out.println("continue: " + quotient/2 + " | " + remainder%2);
        }
        return result;
    }

    public String decToBaseThree() {
        return "";
    }
    public String decToBaseFive() {
        return "";
    }
    public String decToBaseEight() {
        return "";
    }
    public String decToBaseNine() {
        return "";
    }
    public String decToBaseTwelve() {
        return "";
    }
    public String decToBaseSixteen() {
        return "";
    }
}
