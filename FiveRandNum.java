
//  Uniform random numbers. 
//  Write a program that prints five uniform random numbers between 0 and 1, 
//  their average value, and their minimum and maximum values. 
//  Use Math.random(), Math.min(), and Math.max().
public class FiveRandNum {

public static void main(String[] args){

double min = 1;
double max = 0;
double sum = 0;

for(int i = 0; i < 5; i++){

    double r = Math.random();
    System.out.println("Random Number : " + r);
    
    // Calculate average of the generated random numbers
    sum = sum + r;

    // check minimum out of generated random numbers
    min = Math.min(r,min);    

    // check maximum out of generated random numbers
    max = Math.max(r, max);

}

System.out.println("Maximum Number : " +  max);
System.out.println("Minimum Number : " +  min);
System.out.println("Average : " +  sum/5);


}

}