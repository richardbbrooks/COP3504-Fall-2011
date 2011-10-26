public class NumberConversion {
    public static void main(String[] args) {
        
        DecimalToNewBase ten = new DecimalToNewBase(255);
        System.out.println(ten.decToBaseTwo());
        System.out.println(ten.decToBaseThree());
        System.out.println(ten.decToBaseFive());
        System.out.println(ten.decToBaseEight());
        System.out.println(ten.decToBaseNine());
        System.out.println(ten.decToBaseTwelve());
        System.out.println(ten.decToBaseSixteen());
        System.out.println(ten.DecToN(16));
    }
}
