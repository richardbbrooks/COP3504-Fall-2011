public class DriverChangeMaker {

    public static void main(String[] args) {
        ChangeMaker eightyNine = new ChangeMaker((float) .89);

        System.out.println("Quarters: " + eightyNine.getQuarters());
        System.out.println("Dimes: " + eightyNine.getDimes());
        System.out.println("Nickels: " + eightyNine.getNickels());
        System.out.println("Pennies: " + eightyNine.getPennies());
    }

}    
