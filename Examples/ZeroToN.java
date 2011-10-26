public class ZeroToN {
    public static void main(String[] args) {
        System.out.println(doZeroToN(10));
    }
    public static String doZeroToN(int number) {
        if (number <= 0) 
            return String.valueOf(number);
        else
            return doZeroToN(number-1) + " " + number; 
    }
}
