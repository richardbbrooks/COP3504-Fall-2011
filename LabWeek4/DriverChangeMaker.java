public class DriverChangeMaker {

    public static void main(String[] args) {
        ChangeMaker cm = new ChangeMaker((float) .99);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+ "\n");
        
        cm = new ChangeMaker((float) .83);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+"\n");

        cm = new ChangeMaker((float) .75);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+"\n");

        cm = new ChangeMaker((float) .49);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+"\n");

        cm = new ChangeMaker((float) .36);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+"\n");
        
        cm = new ChangeMaker((float) .15);

        System.out.println("Quarters: " + cm.getQuarters());
        System.out.println("Dimes: " + cm.getDimes());
        System.out.println("Nickels: " + cm.getNickels());
        System.out.println("Pennies: " + cm.getPennies()+"\n");
    }

}    
