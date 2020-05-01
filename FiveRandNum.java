
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
    
    // loop five times, i++ is a post incrment operator on i. Even if we replace it by pre increment opearator 
    // loop will work.
    // why ? See the explanation below

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




//This is because a for() loop is generally equivalent to a while() loop: [Not in corner cases like continue etc.]

/*
for (INITIALIZER; CONDITION; OPERATION) {
    do_stuff();
}

Can be written:

INITIALIZER;
while(CONDITION) {
    do_stuff();
    OPERATION;
}

You can see that the OPERATION is always done at the bottom of the loop.
In this form, it should be clear that i++ and ++i will have the same effect:
they'll both increment i and ignore the result. 
The new value of i is not tested until the next iteration begins, at the top of the loop.



Ref: https://stackoverflow.com/questions/4706199/post-increment-and-pre-increment-within-a-for-loop-produce-same-output
*/
