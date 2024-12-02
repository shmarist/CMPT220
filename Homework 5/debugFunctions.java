/*
Referencing LoopsDebug:
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?

//P2: Ask the user for a number. Create a loop to find the factorial of it
//P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
//P5: Take a string from the user and print them the reverse!

Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    
    
    
    
    
    factorial(10);
    problem3(10);
    reverseString("shmarist");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
      
    }

  






    public static void factorial(int abc){
        int factorial = 1;
        for (int i = 1; i <= abc; i++){
            factorial = factorial * i;
            
        }
        System.out.println("The factorial of "+abc+" is "+factorial);
    }


    public static void problem3(int abc){
        int mySum = 0;
        //No hint! what do you need to complete this task?
        for (int i = 1; i <= abc; i = i + 2){
            mySum = mySum + i;

        }
        System.out.println("The sum of every other number until your number is "+mySum);

    }


    public static void reverseString(String abc){
        //P5: Take a string from the user and print them the reverse!
        String reverse = "";
        for (int i = 0; i <abc.length(); i++){
            reverse = abc.charAt(i) + reverse;
    
        }
        System.out.println("Your string reversed is: "+reverse);
    
    }













    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

  
}
