// Computes the wind-chill temperature from the actual temperature
// and the wind speed. This is calculated by the following formula:
//    W = c1 + c2*T -(c3*V**0.16) + c3*T*V**0.16
// T - current air temperature in Fahrenheit
// V - velocity of the wind in miles per hour
// c1-c4 are constants: c1=35.74, c2=0.6215, c3=35.75, and c4=0.4275
// developed by F. M. Carrano


import java.util.Scanner;

public class WindChill {
    
    public static void main(String[] args) {
        
        // output to user describing program purpose
        System.out.println("This program computes the wind-chill ");
        System.out.println("temperature from the actual temperature ");
        System.out.println("and wind speed. \n");
        
        // get input data from user
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        double temperature = keyBoard.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = keyBoard.nextDouble();
        
        // compute wind chill temperature
        final double CONSTANT1 = 35.74,
                     CONSTANT2 = 0.6215,
                     CONSTANT3 = 35.75,
                     CONSTANT4 = 0.4275,
                     EXPONENT  = 0.16;
        double powerTerm = Math.pow(windSpeed, EXPONENT);
        double windChillTemperature = CONSTANT1 + CONSTANT2*temperature - 
                                      CONSTANT3*powerTerm +
                                      CONSTANT4*temperature*powerTerm;
        
        //display results
        //STUDENT NOTE: Did some rounding for cleaner output if the user 
        //              enters data with many numbers after the decimal point
        
        System.out.println("\nThe actual temperature is " + Math.round(temperature*100)/100.0 +
                       " degrees Fahrenheit.");
        System.out.println("The wind speed is " + Math.round(windSpeed*100)/100.0 + " m.p.h.");
        System.out.println("The wind-chill temperature is " +
                       Math.round(windChillTemperature*100)/100.0 + 
                       " degrees Fahrenheit.");
        
    } // end main

} // end WindChill

