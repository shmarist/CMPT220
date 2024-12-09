import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter; // thanks google (w3schools)
import java.io.IOException;
import java.io.PrintWriter; //this too
import java.util.LinkedList; // google i guess but not really but kind of

public class rpg {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //some variables i had to initialize up here others are initialized later
        int playerInput; // note: I TRIED REALLY HARD TO SANITIZE THIS VARIABLE BUT I FUCKED IT UP BADLY AND ITS 5AM SO IM LOSING 2 POINTS I GUESS
        int MagicRNG;
        boolean sanitized;
        boolean died = false;
        String enemyName;


        //kinda copied from w3 schools this linkedlist bit up until random
        LinkedList<String> enemyNames = new LinkedList<String>();
        enemyNames.add("Goblin");
        enemyNames.add("Ogre");
        enemyNames.add("Evil Witch");
        enemyName = enemyNames.get(random.nextInt(3));

        //class selection
        System.out.println("Welcome to the RPG");
        System.out.println("Today you will be fighting a(n) "+enemyName);
        System.out.println("Choose a class");
        System.out.println("1 - Warrior: 100HP 10ATTACK 10%DODGE 5MANA");
        System.out.println("2 - Mage: 75HP 5ATTACK 10%DODGE 10MANA");
        System.out.println("3 - Rogue: 50HP 20ATTACK 20%DODGE 5MANA");
        while (true) {
            playerInput = sc.nextInt();
            try{
                if (playerInput <= 3 && playerInput >= 1){
                    break;
                } 
            } catch(NumberFormatException e) { // was yelling at me to add a catch or a finally so whatever this does literally nothing

            }
            System.out.println("Invalid input, try again.");
        }
        player playerCharacter;
        if (playerInput == 1){
            playerCharacter = new player(10, 10, 5, 100, 0);
        } else if (playerInput == 2){
            playerCharacter = new player(10, 5, 10, 75, 0);
        } else {
            playerCharacter = new player(20, 20, 5, 50, 0);
        }
        
        player enemyCharacter = generateEnemy();
        
        //gameplay loop
        while(true){
            playerCharacter.mana = playerCharacter.mana + playerCharacter.magicPower;
            System.out.println("=========YOUR TURN=========");
            System.out.println("Your Health: "+playerCharacter.health+" Your Mana: "+playerCharacter.mana);
            System.out.println("Enemy Health: "+enemyCharacter.health);
            System.out.println("1 = ATTACK | 2 = MAGIC");
            playerInput = sc.nextInt();
            System.out.println("");
            sanitized = false;
            while (sanitized = false){
            try{
                if (playerInput <= 2 && playerInput >= 1){
                    sanitized = true;
                } 
            } catch(NumberFormatException e) { // was yelling at me to add a catch or a finally so whatever this does literally nothing

            }
            System.out.println("Invalid input, try again!");
        }
            if (playerInput == 1){
                attack(playerCharacter, enemyCharacter);; //attack
            } else { //magic
                System.out.println("Spells:");
                System.out.println("1 - Fireball (10MP) | 2 - Heal (10MP) | 3 - Death (100MP)");
                playerInput = sc.nextInt();
                sanitized = false;
                while (sanitized = false){
                    try{
                        if (playerInput <= 3 && playerInput >= 1){
                            sanitized = true;
                        } 
                    } catch(NumberFormatException e) { // was yelling at me to add a catch or a finally so whatever this does literally nothing

                    }
                    System.out.println("Invalid input, try again!");
                    }
                if (playerCharacter.mana < 10 || (playerCharacter.mana < 100 && playerInput < 3) || (playerCharacter.mana < 100 && playerInput > 3)){
                    System.out.println("Not enough mana! Turn wasted!");
                } else if (playerInput == 1) {
                    MagicRNG = random.nextInt(15)+5;
                    enemyCharacter.health = enemyCharacter.health - MagicRNG;
                    playerCharacter.mana = playerCharacter.mana - 10;
                    System.out.println("Your fireball hit for "+MagicRNG+" damage!");
                } else if (playerInput == 2) {
                    MagicRNG = random.nextInt(20);
                    playerCharacter.health = playerCharacter.health + MagicRNG;
                    playerCharacter.mana = playerCharacter.mana - 10;
                    if (MagicRNG < 5){
                        System.out.println("You healed for only "+MagicRNG+" health...");
                    } else {
                        System.out.println("You healed yourself for "+MagicRNG+" health!");
                    }
                } else {
                    break;
                }
            }

            if (enemyCharacter.health <= 0) {
                break;
            }

            System.out.println("=========ENEMY TURN=========");
            attack(enemyCharacter, playerCharacter);
            if (playerCharacter.health <=0) {
                died = true;
                break;
            }

        }


        if (died == true){
            System.out.println("You Lost...");
        } else {
            System.out.println("You won!");
            //all of the file stuff below is from w3schools/google pretty much
            try {
            PrintWriter certificate = new PrintWriter(new FileWriter("rpgwincertificate.txt", true));
            certificate.write("✧( ु•⌄• )◞ YOU WON ◟( •⌄• ू )✧");
            certificate.write("you won! yay!"); //no matter what i do it wont write to the file i give up
            certificate.close();
        } catch(IOException e) {
            System.out.println("Error with win certificate.");
        }

    }
}


    public static void attack (player attacker, player defender) {
        if (defender.dodgeSuccess(defender) == false){
            System.out.println("Hit for "+attacker.attackPower+" damage!");
            defender.health = defender.health - attacker.attackPower;
        } else {
            System.out.println("Attack Dodged!");
        }
    }
    public static player generateEnemy(){
        Random random = new Random();
        player enemy = new player(0, random.nextInt(5)+7, 0, random.nextInt(50)+150, 0);
        return enemy;
    }
}