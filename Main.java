import java.util.Scanner;
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
        boolean playerCountChosen = false;
        int playerCount = 0;
        while (!playerCountChosen) {
            System.out.println("Welcome Star Warrior(s). 1 or 2 Players?");
            playerCount = scan.nextInt();
            if (playerCount == 1 || playerCount == 2) {
                playerCountChosen = true;
            }
        }
        // create array of constellations
        String[] constellationNames = {
                "Aquila","Astra","Cancer","Canis Major","Capricornus","Leo","Lyra","Pisces","Scorpius"
        };
        System.out.println("Your choice include: ");
        for (int i =0; i < constellationNames.length; i++) {
            if (i == (constellationNames.length)-1) {
                System.out.println("and " + constellationNames[i] + ".");
            } else {
                System.out.print(constellationNames[i] + ", ");
            }
        }
        System.out.println("Player 1 Choice:");

        if (playerCount == 2) {
            System.out.println("Player Choice:");
        }
        System.out.print("\n \n \n");
    }
}
