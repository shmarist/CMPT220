
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
        java.util.List<Integer> blacklist = new java.util.ArrayList<Integer>(); // had to google some stuff about lists for this lol
        for (int i = 0; i < myArray.length; i++){
            int current1 = myArray[i]; 
            int duplicates = 0;
            for (int j = i; j < myArray.length; j++){
                int current2 = myArray[j];
                if (current1 == current2){
                    duplicates = duplicates + 1;
                }
            }
            if (duplicates > 1 && blacklist.contains(current1) == false){
                System.out.println(myArray[i]+": "+duplicates+" times");
                blacklist.add(current1);
            }
        }
    }
}
