//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */

//hi this line is here to disclose that i used this for help: https://stackoverflow.com/questions/7410635/java-not-saying-that-two-strings-equal-when-they-do
public class ifelsepractice {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, today we are doing a quiz game, please enter all answers in only lowercase");
        System.out.println("What is the definition of a cat according to my brother?");
        String cat = sc.nextLine();
        if (cat.equals("a furry thing that meows")){
            System.out.println("Correct");
            score = score + 1;
        } else{
            System.out.println("Incorrect");
        }
        System.out.println("Next question. What game am I hopelessly addicted to?");
        String game = sc.nextLine();
        if (game.equals("minecraft")){
            System.out.println("Correct");
            score = score + 1;
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("Final question for 100 points. What is the integral of x cos(9x) dx in the form I got when I solved it");
        String math = sc.nextLine();
        if (math.equals("(9xsin(9x)+cos(9x))/81 + c")){
            System.out.println("Correct");
            score = score + 100;
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("Your final score is: " + score);
        


    }
}


