import java.util.InputMismatchException;
import java.util.Scanner;

public class DragonCave {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon"
                + " is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight."
                + "\nWhich cave will you go into? (1 or 2): ");

        while(true) {
            try {
                int selection = keyboard.nextInt();
                String output = userSelection(selection);

                if (output.equals("\nPlease pick 1 or 2")){
                    System.out.println(output);
                    continue;
                }else{
                    System.out.println(output);
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid character, please select 1 or 2");
                keyboard.nextLine();
            }
        }
    }

    public static String userSelection(int s){
        if (s == 1){
            return "\nYou approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front "+
                    "of you! He opens his jaws and...\nGobbles you down in one bite!";
        }else if(s == 2) {
            return "\nYou approach the cave...\nIt is dark and mysterious...\nA large dragon appears in front of you" +
                    " and allows you to access he's treasures";
        }else{
            return "\nPlease pick 1 or 2";
        }
    }
}

