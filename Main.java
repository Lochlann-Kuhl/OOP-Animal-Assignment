import java.util.*;
public class Main {
    public static void main(String[] args){
    // testing --> to be deleted
        int lad;
        int lad2 = 5;
        Capricornus tommy = new Capricornus() ;
        lad = tommy.Agility(lad2);
        System.out.println(lad);
    // beginning of actual code
        // create scanner
        Scanner scan = new Scanner(System.in);
        // defining variables & arrays
        boolean playerCountChosen = false;
        boolean p1ChoiceValid = false;
        boolean p2ChoiceValid = false;
        int playerCount = 0;
        String player1Choice;
        String player2Choice;
        String[] constellationNames = {
                "Aquila","Astra","Cancer","Canis Major","Capricornus","Leo","Lyra","Pisces","Scorpius"
        };
        while (!playerCountChosen) {
            System.out.println("Welcome Star Warrior(s). 1 or 2 Players?");
            playerCount = scan.nextInt();
            scan.nextLine();
            if (playerCount == 1 || playerCount == 2) {
                playerCountChosen = true;
            }
        }
        System.out.println("Your choices include: ");
        for (int i =0; i < constellationNames.length; i++) {
            if (i == (constellationNames.length)-1) {
                System.out.println("and " + constellationNames[i] + ".");
            } else {
                System.out.print(constellationNames[i] + ", ");
            }
        }
        // note: include some insult towards capricornus
        while (!p1ChoiceValid) {
            System.out.println("Player 1 Choice:");
            player1Choice = scan.nextLine();
            p1ChoiceValid = characterValid(constellationNames,player1Choice);
            if (!p1ChoiceValid) {
                System.out.println("That was not one of the options. Pick again.");
            }
        }
        if (playerCount == 2) {
            while (!p2ChoiceValid) {
                System.out.println("Player 2 Choice:");
                player2Choice = scan.nextLine();
                p2ChoiceValid = characterValid(constellationNames,player2Choice);
                if (!p2ChoiceValid) {
                    System.out.println("That was not one of the options. Pick again.");
                }
            }
        }
        System.out.print("\n \n \n");
    }

    public static boolean characterValid (String[] constNames, String pC) {
        boolean isValid = false;
        for (String constName : constNames) {
            if (pC.equalsIgnoreCase(constName)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
