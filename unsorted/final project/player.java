import java.util.Random;

public class player {
    int dodgeChance; //1-100 %
    int attackPower; //how much dmg player do
    int magicPower; //how much mana player get after turn
    int health; // health ofc
    int mana; // mana
    public player(int d, int a, int  m, int h, int man){
        dodgeChance = d;
        attackPower = a;
        magicPower = m;
        health = h;
        mana = man;
    }
    
    public boolean dodgeSuccess(player player) { //calculate (incorrectly probably but not by a lot) if a dodge is successful
        Random random = new Random();
        return random.nextInt(99)+1 <= player.dodgeChance;
    }


}
