// Refer geeksforgeeks: http://www.geeksforgeeks.org/directi-interview-set-5-campus/

import java.util.Scanner;

/**
 * Class to find out number of strings with length n and given constraints.
 * @author gaurav
 */
class FindNumberOfStrings {

    static final int returnNumberOfStrings (String output, int r, int g, int b, int length, int n) {
        
        if (length == n && r <= 0 && b <= 0 && g <= 0) {
            System.out.println(output);
            return 1;
        } else if (length == n) {
            return 0;
        }
        else {
          return returnNumberOfStrings(output.concat("G"), r, g-1, b, length + 1, n) + returnNumberOfStrings(output.concat("B"), r, g, b-1, length + 1, n) + returnNumberOfStrings(output.concat("R"), r-1, g, b, length + 1, n);
        }
    }
    
 // Main method.
    public static void main(String[] args) {
        /**
         * length Length of string.
         * r 'R' types in string.
         * g 'G' types in string.
         * b 'B' types in string.
         * str String constructed.
         */
        int length, r, g, b;
        String str = "";
        
        // Get Scanner for input.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length of string");
        length = scanner.nextInt();
        
        System.out.println("Enter r");
        r = scanner.nextInt();
        System.out.println("Enter g");
        g = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
    
        System.out.println("Total number of strings: " + returnNumberOfStrings(str, r, g, b, 0, length));
        
        // Close resource.
        scanner.close();
    }
}
