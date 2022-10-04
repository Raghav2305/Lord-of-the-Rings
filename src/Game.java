






import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Game {
    Scanner scanner = new Scanner(System.in);


    String playerName;
    int playerHP ;
    int monsterHP;
    int SauronsHp;
    String playerWeapon1;
    String playerWeapon2;
    int choice;
    String currentWeapon;


    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(" \n\n                                          WELCOME TO THE LORD OF THE RINGS ADVENTURE GAME        ");
        game.playerSetup();
        game.map();
        }






    public void playerSetup(){


        System.out.println("Please enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello!! " + playerName );
        playerHP = 5;
        monsterHP = 10;
        playerWeapon1 = "Knife";
        playerWeapon2 = "Long Sword";
        System.out.println("Your Hp: " + playerHP);
        System.out.println("Your weapons: " +
                "\n1: Knife\n2: Long sword");



    }

    public void map(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Currently you are at Bag end , Hobbiton in The Shire");
        System.out.println("You have a very powerful and evil ring which you have to keep a secret .");
        System.out.println("");
        System.out.println("The ring needs to be destroyed before it falls in Sauron's hand.");
        System.out.println("");
        System.out.println("What do you want to do??");
        System.out.println("1: Leave Hobbiton" +
                            "\n2: Stay at Hobbiton");
        System.out.println("---------------------------------------------------------");

        choice = scanner.nextInt();

        if(choice == 1){
            goToRivendell();
        }else{
            System.out.println("You waited too long in hobbiton");
            System.out.println("Sauron's army found you and killed everyone in hobbiton");
            playerHP = 0;
        }


    }

    public void goToRivendell(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("You have reached Rivendell");
        System.out.println("You are currently at the council of Elrond to make the strategy to destroy the ring ");
        System.out.println("You have to set out on a dangerous journey with 9 different people including" +
                "\nyour friends Sam, Merry and Pippin and Dwarves and Elfs");
        System.out.println("What do you choose???");
        System.out.println("1: Go on the journey" +
                "\n2:Stay back because of upcoming danger");
        System.out.println("-----------------------------------------------------------------");

        choice = scanner.nextInt();

        if(choice==1){
            moria();
        }else{
            System.out.println("                                       GAME OVER   ");
            System.out.println("You were too afraid to go on");
            System.out.println("Returning to Hobbiton.............");
            map();
        }
    }

    public void moria(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("You have reached the mines of Moria.... Be Careful ");
        System.out.println("You see a big gate in front of you which you cannot open  ");
        System.out.println("Something written in Elvish is engraved on the door. Its like a code");
        System.out.println("Gandalf comes to the rescue and opens the door after whispering something in Elvish");
        System.out.println("You enter the gate and start walking forward........" +
                "\nSuddenly you see a bunch of Orcs . You need to kill them to go further or you will be dead.");
        System.out.println("What do you do???");
        System.out.println("1: Attack" +
                "\n2: Run");
        System.out.println("-----------------------------------------------------------------------");

        choice =    scanner.nextInt();
        if(choice==1){

            int playerDamage =0;
            System.out.println("Which weapon you want to use?");
            System.out.println("1: Knife" +
                    "\n2: Long Sword");
            choice = scanner.nextInt();
            if(choice==1){
                currentWeapon = playerWeapon1;
                playerDamage = new java.util.Random().nextInt(5);
            }else{
                currentWeapon = playerWeapon2;
                playerDamage = new java.util.Random().nextInt(8);
            }









            System.out.println("You attacked the orc and gave " + playerDamage + " damage!");

            monsterHP = monsterHP - playerDamage;

            System.out.println("Monster HP: " + monsterHP);

            if(monsterHP<1){ result(); } else if(monsterHP>0){
                int monsterDamage =0;

                monsterDamage = new java.util.Random().nextInt(4);

                System.out.println("The orc attacked you and gave " + monsterDamage + " damage!");

                playerHP = playerHP - monsterDamage;

                System.out.println("Player HP: " + playerHP);

                if(playerHP<1){ dead();

                }
            }

                if(result()) {
                    helmsDeep();
                }
        }
        else if(choice == 2){
            System.out.println("The orcs and the Balrog outnumbered you and you died!!");
            System.out.println("If you wish to restart" +
                    "\nPress 1:");

            choice = scanner.nextInt();
            if(choice==1) {
                map();
            }
        }

    }

    public void helmsDeep() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("You have reached Helm's Deep...");
        System.out.println("This is one of the most dangerous places in your journey bu if you follow gandalf he will " +
                "protect you from the dangers");
        System.out.println("Suddenly you have a feeling that someone is following you . You look back and find a small evil creature " +
                "\ncalled Gollum. He has been following you since a long time. He wants to get a hold over your ring. " +
                "\nBut he cant be trusted");
        System.out.println("He says that he knows a secure way to get to the mount doom");
        System.out.println("What do you do???");
        System.out.println("1: Let him come with you as he has done no harm till now" +
                "\n2: Kill him");
        System.out.println("-----------------------------------------------------------------");

        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("You did the right thing");
            mountDoom();
        } else {
            System.out.println("You Killed Gollum");
            System.out.println("You cannot reach Mount Doom securely without him");
            System.out.println("                                          GAME OVER");
            dead();
        }
    }

    public void mountDoom(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("You have reached Mount Doom");
        System.out.println("Your objective is to destroy the ring in the fire of Mount Doom");
        System.out.println("Sauron has identified your location and is coming to kill you." +
                "\nYou must destroy the ring before he gets you.");
        System.out.println("You start climbing the mountain to find the cracks where the one ring was forged");
        System.out.println("Sauron appears in front of you out of nowhere and now you have no option other than fighting with him");
        int playerDamage =0;


        System.out.println("Which weapon you want to use?");
        System.out.println("1: Knife" +
                "\n2: Long Sword");
        choice  =scanner.nextInt();

        if(choice==1){
            currentWeapon = playerWeapon1;
            playerDamage = new java.util.Random().nextInt(5);
        }else{
            currentWeapon = playerWeapon2;
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked Sauron and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Monster HP: " + monsterHP);

        if(monsterHP<1){ result1(); } else if(monsterHP>0){
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println(" Sauron  gave you " + monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1){ dead();

            }
        }
    }



































public boolean result(){
        monsterHP = 0;
    System.out.println("You killed all the orcs...");
    System.out.println("Now you can move forward");
    return true;
}

public boolean result1(){
    System.out.println("You killed Sauron");
    System.out.println("                                                   YOU WON THE GAME");
    return true;
}










    public void dead(){
        playerHP = 0;
        System.out.println("You died while fighting");
        System.out.println("Game over");
        System.out.println("If you wish to restart" +
                "\nPress 1:");

        choice = scanner.nextInt();
        if(choice==1){
            map();
        }else{
            System.out.println("Thanks for playing ");
            System.out.println("See you next time.......😊😊😊");
        }
    }
}
