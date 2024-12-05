//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filepractice {
    public static void main(String[] args){
        //do you need something to start?
        File inputfile = new File("C:\\Users\\samue\\Downloads\\practice.txt");
        List<String> list = new ArrayList<String>();
        List<String> highGPA = new ArrayList<String>();

        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()){
                list.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
      
      for (int i = 0; i < list.size(); i = i + 2){
        String name = list.get(i);
        Double gpa = Double.parseDouble(list.get(i+1));

        if (gpa > 3.5) {
            highGPA.add(name);
        }
      }
      System.out.println("People with a GPA over 3.5: "+highGPA);
      System.out.println("Total number of names: "+list.size() / 2);
      
      
        //optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println(list);
    }
}
