public class Hero {
     private int hp;
     private int attack;
     private boolean alive;

     public Hero(int hpIn,int attackIn){
         hp = hpIn;
         attack = attackIn;
         alive=true;
     }

     public int takeDamage(int damage){
         hp= hp-damage;
         if(hp<=0){
             alive=false;
         }
         return hp;
     }

    public int getAttack(){
        return attack;
    }

    public int getHP(){
         return hp;
    }

}
