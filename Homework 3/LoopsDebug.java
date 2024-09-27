import java.util.Scanner;
public class LoopsDebug {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int myNum;
        Scanner sc = new Scanner(System.in);
        myNum = sc.nextInt();
        //here's a hint
        int factorial = 1;
        for (int i = 1; i <= myNum; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of "+myNum+" is "+factorial);
        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int myNum2;
        myNum2 = sc.nextInt();
        int mySum = 0;
        //No hint! what do you need to complete this task?
        for (int i = 1; i <= myNum2; i = i + 2){
            mySum = mySum + i;

        }
        System.out.println("The sum of every other number until your number is "+mySum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Type a string you want reversed:");
        sc.nextLine();
        String myString = sc.nextLine();
        String reverse = "";
        for (int i = 0; i <myString.length(); i++){
            reverse = myString.charAt(i) + reverse;

        }
        System.out.println("Your string reversed is: "+reverse);

    }
}
