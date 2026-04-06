// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * 9.0 / 5.0 + 32;    }
        
    } // CelciusToFahrenheit closed

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");
            double temp = scanner.nextDouble();

            // (part 1) conversion from C to F
            Inner() implements TempConvert {
                @Override
                public double convert(double temp) {
                    return temp *9/5 + 32;
                }
            };
            
            // (part 2) conversion from F to C
            
            
            // (part 3) conversion from F to K 
            TempConvert (temp) -> {(temp - 32) * 5/9};

        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed