/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
import java.util.Random;

public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    //new method
    public boolean honorRoll(student student) {
        return student.gpa > 3.6;
    }

    
    //new method
    public boolean freeLunch(student student) {
        // ok you want me to generate a random id but it has to be the same random id for everyone so
        // im not sure how im gonna do that when it has to change every 24h
        // ill just pretend its just a 10% chance of getting free lunch or something i really dont
        // know how to implement what you want  
        Random random = new Random();
        return student.id == random.nextInt(10);
    }

}
