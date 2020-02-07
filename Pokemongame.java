//import java.util.ArrayList;
import java.util.Scanner;
public class Pokemongame{
  
    public static void main(String[] args){
        System.out.println("----------------Welcome to Pokemon game-------------------");
        System.out.println("      Choose your first Pokémon         ");
        System.out.printf("(1) first pokeball \n(2) second pokeball \n(3) third pokeball \n");
        Pokemongame f1 = new Pokemongame();
        User u1= new User();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();    
       
        System.out.println("  Choose Success");
        u1.getfirstPOKEMON(choice);
        f1.whattxtNEXT();

        choice = sc.nextInt();
        while(f1.whatNEXT(choice) != 3){
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("fight start! choose your pokemon");
                f1.fightSTART();
            }else if(choice == 2){
                f1.whattxtNEXT();
            }else
                continue;
        }
        System.out.println("See you");
        sc.close();
    }

   //------------Pokemon game Method---------------//

    private void whattxtNEXT(){
        System.out.println("---------------- What u want to do next ------------------");
        System.out.printf("(1) catch pokemon  \n(2) ------- \n(3) quit game \n");
    }

    private int whatNEXT(int number){
        if(number == 1){
            System.out.println("walking...");
            pokemonSURVAY();
        }else if(number != 2 && number != 1)
            System.out.println("no choice");
        return number;
    }
    private void pokemonSURVAY(){
        if(Math.random() >= 0.5)
            System.out.println("You found pokemon rank C");
        else if (Math.random() >= 0.2 && Math.random() < 0.5)
            System.out.println("You found pokemon rank B");
        else
            System.out.println("You found pokemon rank A");
        System.out.printf("(1) fight\n(2) run\n");
    }
    public void fightSTART(){
        System.out.println("");
        }
    }
