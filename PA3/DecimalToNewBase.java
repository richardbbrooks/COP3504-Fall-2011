public class DecimalToNewBase {
    private int decimal;

    public DecimalToNewBase(int num) {
        decimal = num;
    }

    public String DecToN(int base) {
        //EXTRA CREDIT
        return "";
    }

    private String performBaseConversion(int p_base, int p_quotient, int p_remainder, String p_result) {
        //Complicated
        return "";
    }

    public String decToBaseTwo() {
        return (decToBaseTwo(decimal / 2, decimal % 2));    
    }
    private String decToBaseTwo(int p_quotient, int p_remainder) {
        String result = "";
        if (p_quotient < 1) {
            System.out.println("break: " + p_quotient + " | " + p_remainder);
            return String.valueOf(p_remainder);
        } else {
            result = decToBaseTwo(p_quotient / 2, p_remainder % 2) + String.valueOf(p_remainder);
            System.out.println("continue: " + p_quotient + " | " + p_remainder);
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
