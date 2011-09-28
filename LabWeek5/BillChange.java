public class BillChange {
    private float initialMoney, money;
    private int twenties = 0, tens = 0, fives = 0, ones = 0;

    public BillChange(float change) {
        money = initialMoney = change;
    }

    public void calculateChange() {
        calculateTwenties();
        calculateTens();
        calculateFives();
        calculateOnes();
    }

    private void calculateTwenties() {
       //Math.round() because of floating point fun
       if (Math.round(money * 100.0) / 100.0  >= 20.00) {
           twenties++;
           money -= 20.00;
           this.calculateTwenties();
       }
       return;
    }

    private void calculateTens() {
       //Math.round() because of floating point fun
       if (Math.round(money * 100.0) / 100.0 >= 10.00) {
           tens++;
           money -= 10.00;
           this.calculateTens();
       }
       return;
    }

    private void calculateFives() {
       //Math.round() because of floating point fun
       if (Math.round(money * 100.0) / 100.0 >= 5.00) {
           fives++;
           money -= 5.00;
           this.calculateFives();
       }
       return;
    }
   
    private void calculateOnes() {
        //Math.round() because of floating point fun
        ones = (int) Math.round(money); 
    }

    public int getTwenties() {
        return twenties;
    }
    
    public int getTens() {
        return tens;
    }
    
    public int getFives() {
        return fives;
    }
    
    public int getOnes() {
        return ones;
    }

    public float getInitialMoney() {
        return initialMoney;
    }

    //OVERRIDE - toString
    @Override public String toString() {
        String result = "";

        if(this.getTwenties() == 0 || this.getTwenties() > 1) {
            result += this.getTwenties() + " twenties, ";
        } else {
            result += this.getTwenties() + " twenty, ";
        }
        
        if(this.getTens() == 0 || this.getTens() > 1) {
            result += this.getTens() + " tens, ";
        } else {
            result += this.getTens() + " ten, ";
        }
        
        if(this.getFives() == 0 || this.getFives() > 1) {
            result += this.getFives() + " fives, ";
        } else {
            result += this.getFives() + " five, ";
        }

        if(this.getOnes() == 0 || this.getOnes() > 1) {
            result += this.getOnes() + " ones.";
        } else {
            result += this.getOnes() + " one.";
        }

        return result;
    }
}
