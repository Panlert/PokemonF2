
public class User{

    //private Array[] pokemonLIST;
    private int pokeball;
    private int berry;

    public User(){
        pokeball = 15;
        berry = 0;
    }

    public void getfirstPOKEMON(int number){
        Pokemon p = new Pokemon();
        //String name = p.getName();
        if(number == 1){
            p.setName("Charmander");
            System.out.printf("   Your first pokemon is ");
            p.getName();
        }else if(number == 2){
            p.setName("Squirtle");
            System.out.printf("   Your first pokemon is ");
            p.getName();
        }else if(number == 3){
            p.setName("Pickachu");
            System.out.printf("   Your first pokemon is ");
            p.getName();
        }else{
            System.out.printf("-----------No-choice------------\n");
            getfirstPOKEMON(number);
        }
    }

    public void setPokeball(int num){
        pokeball += num;
    }
    public int getPokeball(int num){
        return pokeball;
    }
    /*public void setPokemonLIST(){
        this.pokemonLIST++;
    }
    public int getPokemonLIST(){
        return pokemonLIST;
    }*/
    

}

    
   /* public void pokemonCATCH(){
        System.out.println("Use berry????");
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        if("Yes".equals(q) || "yes".equals(q) || "Y".equals(q)){
            if(berry > 0){
                berry--;
                get_Pokemon(Math.random());
            }else System.out.println("not enough berries");
        }
        else{
            if(Math.random() >= 0.70)
                get_Pokemon(Math.random());
            else{
                System.out.println("Fail");                    
                pokeball--;
                System.out.println("You have "+pokeball+" pokeball left");
            }
        }

    public void pokemonFEED(int berryin){
    }

    public void get_Pokemon(Double x){
        pokemonLIST++;
        if(x >= 0.5){
            pokemonNAME = "pikachu";
            System.out.println("You received "+pokemonNAME);
        }else{
            pokemonNAME = "kingkong";
            System.out.println("You received "+pokemonNAME);
        }
        pokeball--;
        System.out.println("You have "+pokeball+" pokeball left");
    }
}*/