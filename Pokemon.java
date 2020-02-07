public class Pokemon{
    
    private String name;
    private int lv;
    /*private int HP,MP,atkDMG;
    private int oldLV=1;*/
    public Pokemon(String name){
        this.name = name;
        lv = 1;
    }
    public Pokemon(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    /*
    public static void berryEat(int eat){ 
        if(eat > 0){
            System.out.println("Pokemon sleep..zZZ");
        }
    }
    public static void lvUP(int pokemonLV){
        //int i=0;
        while(pokemonLV != oldLV){
            HP += 50;
            MP += 20;
            atkDMG += 10;
            oldLV++;
           // i++;
        }
        System.out.println("Your pokemon lv.up!");
        //System.out.println("lv = "+i);
    }

    public static void pokemonSTATUS(){
        System.out.println("HP= "+HP);
        System.out.println("MP= "+MP);
        System.out.println("AttackDamage= "+atkDMG);
        System.out.println("LV= "+pokemonLV);
    }
    public static int pokemonFIGHT(int dmg, int hp){
        while(hp != 0){
            hp -= atkDMG;
            HP -= dmg;
            if(HP <= 0)  
        }
    }*/
}