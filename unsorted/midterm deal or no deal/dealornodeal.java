import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class dealornodeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //game setup 
        int casetoremove;
        Random random = new Random();
        List<Integer> moneyvalues = new ArrayList<>(List.of(1, 2, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000));
        // btw shoutout google for the list.of thing above that was annoying af
        List<Integer> randomizedmoney = new ArrayList<Integer>(); 

        for (int i=0; i < 26; i++){
            casetoremove = random.nextInt(moneyvalues.size());
            randomizedmoney.add(moneyvalues.get(casetoremove));
            moneyvalues.remove(casetoremove);
        }
        
        //choose a case
        System.out.println("Choose your case (1-26)");
        casetoremove = sc.nextInt() - 1;
        int playervalue = randomizedmoney.get(casetoremove);
        randomizedmoney.remove(casetoremove);

        //game starts (removing cases starts)
        int casesleft = 25;
        int sum;
        
        while (true) {
            //check if its time for an offer
            if (casesleft == 19 | casesleft == 14 | casesleft == 10 | casesleft == 7 | casesleft <= 5 ){
                sum = 0;
                for(int i = 0; i < randomizedmoney.size(); i++){
                    sum = sum + randomizedmoney.get(i);
                sum = sum + playervalue;
                    // System.out.println("sum = "+sum);
                    // System.out.println("i = "+i);
                    // System.out.println("randomizedmoney.get(i) = "+randomizedmoney.get(i));
                    //ignore this its for debugging 
                }
                System.out.println("Your offer is: $"+(sum/(randomizedmoney.size()+1)));
                System.out.println("1 = NO DEAL 2 = DEAL");
                if (sc.nextInt() == 2){
                    System.out.println("You won $"+sum/(randomizedmoney.size()+1));
                    break;
                }
                
            }
            //remove a case (if more than 2 cases left)
            if (casesleft > 1){
                System.out.println("Remove a case (Type 1-"+randomizedmoney.size()+")");
                casetoremove = sc.nextInt() - 1;
                System.out.println("You removed the $"+randomizedmoney.get(casetoremove)+" case");
                randomizedmoney.remove(casetoremove);
                casesleft = casesleft - 1;
            }
            else{
                System.out.println("1 = KEEP YOUR CASE 2 = SWAP YOUR CASE");
                casetoremove = sc.nextInt(); //im just reusing this variable cause why not
                if (casetoremove == 1) {
                    System.out.println("You won $"+playervalue);
                    System.out.println("The other case was $"+randomizedmoney.get(0));
                    break;
                } 
                else{
                    System.out.println("You won $"+randomizedmoney.get(0));
                    System.out.println("Your case was $"+playervalue);
                }

            }
            
        }




    }
}
