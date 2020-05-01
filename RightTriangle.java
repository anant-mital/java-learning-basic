
/* Write a program RightTriangle that takes three int command-line arguments and determines 
 * whether they constitute the side lengths of some right triangle.
 * The following two conditions are necessary and sufficient:
   1) Each integer must be positive.
   2) The sum of the squares of two of the integers must equal the square of the third integer.
 */
public class RightTriangle {

    public static void main(String[] args){

        int x = 0,y = 0,z = 0;

        // Get input values from command line arguments
        try{

            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = Integer.parseInt(args[2]);

        }catch(NumberFormatException nfex){

            System.out.println("Illegal number input.");
            nfex.printStackTrace();

        }

        // Check whether the integer input is positive.
        if (x < 1 || y < 1 || z < 1){

           System.out.println("Input numbers are not positive integers.");
           return;

        }

        // Sort the three integers, such that
        // x, y, z are in ascending order

        int max = Math.max(Math.max(x,y),z);
        int min = Math.min(Math.min(x,y),z);
        int mid = (x > min && x < max) ? x : ((y > min && y < max)? y :z); // this notation is (?: -> if-then-else) is called ternary operator

        x = min;
        y = mid;
        z = max;

        // check the three integers form a right angled triangle
        // i.e. x^2 + y^2 = z^2

        long _x = x*x; // long because int * int can overflow
        long _y = y*y;
        long _z = z*z;

        if( _x + _y == _z ){

            System.out.println("true");

        }else{

            System.out.println("false");
        }

    }

    
}