public class WTFSumDifferenceRecursion {
    public static void main(String[] args) {
        System.out.println(difference(10));
    }
    public static int difference(int num) {
        int sum = 0;
        if (num <= 0) 
            return 0;
        
        if (even(num)) 
            return difference(num-1) + num;
        else 
            return difference(num-1) - num;
    }
    public static boolean even(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}
