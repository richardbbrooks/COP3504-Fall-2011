public class DriverBillChange {

    public static void main(String[] args) {
        BillChange cm = new BillChange((float) 99.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");

        cm = new BillChange((float) 83.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");

        cm = new BillChange((float) 75.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");

        cm = new BillChange((float) 47.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");

        cm = new BillChange((float) 36.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");
        
        cm = new BillChange((float) 15.00);
        cm.calculateChange();

        System.out.println("Twenties: " + cm.getTwenties());
        System.out.println("Tens: " + cm.getTens());
        System.out.println("Fives: " + cm.getFives());
        System.out.println("Ones: " + cm.getOnes());
        System.out.println(cm.toString()+ "\n");
    }

}    
