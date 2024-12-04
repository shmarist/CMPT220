/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

// reason for function: might need a random odd number and its easier to call the function than type
// the divide by 2 - 1 stuff every time
// had to google how to use java.util.random for this but i figured it out i think

import java.util.Random;
import java.util.Scanner;

public class functions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I will generate a random odd number for you.");
        System.out.println("What is the maximum value you want?");
        int max = sc.nextInt();
        int randomodd = randomOdd(max);
        System.out.println("Your odd number is: "+randomodd);
    }
    
    
    public static int randomOdd(int max) {
        Random random = new Random();
        return (random.nextInt(max/2)*2) - 1;
    }
}
