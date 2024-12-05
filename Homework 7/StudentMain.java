// I gave a working example of a student!
public class StudentMain {
    public static void main(String[] args){

            student MelC = new student("Melissa","Senior",3.4,1);
            student JoeA = new student("Joe", "Freshman", 2.6, 2);
            student JoeyB = new student("Joey", "Freshman", 2.9, 3);
            student KatG = new student("Kat", "Junior", 2.4, 4);
            student PabloR = new student("Pablo", "Sophomore", 3.9, 5);

            System.out.println("is Kat an honor roll student: " +KatG.honorRoll(KatG));
            System.out.println("is Pablo an honor roll student: " +PabloR.honorRoll(PabloR));
            System.out.println("is Joey an honor roll student: " +JoeyB.honorRoll(JoeyB));
            System.out.println("is Joe an honor roll student: " +JoeA.honorRoll(JoeA));
            System.out.println("is Mel an honor roll student: " +MelC.honorRoll(MelC));

            System.out.println("does Kat get free lunch today? "+KatG.freeLunch(KatG));
            System.out.println("does Pablo get free lunch today? "+PabloR.freeLunch(PabloR));
            System.out.println("does Joey get free lunch today? "+JoeyB.freeLunch(JoeyB));
            System.out.println("does Joe get free lunch today? "+JoeA.freeLunch(JoeA));
            System.out.println("does Mel get free lunch today? "+MelC.freeLunch(MelC));

    }
}








