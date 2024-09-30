/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String myString;
        Scanner sc = new Scanner(System.in);
        myString = sc.nextLine();
        for (int i = 0; i < myString.length(); i++){
            System.out.println(myString.charAt(i));
        }



    }
}
/*write up
 * i found .length() and .charAt(i) on google
 * translation of code: it loops once for every character in the string and prints the 1st character on
 * the 1st loop 2nd on 2nd etc
 *  i picked i = 0 i < mystring.length and i++ for my loop because the index 0 is the first character
 *  in my string, i only want to go up to the final character in the string to avoid any errors, and i
 * want i to increment up by 1 each time we go through the loop
 * myString.charAt(i) is doing the work with the string, finding the character in the string at the 
 * index i each time we run the loop
 */