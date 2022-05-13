import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean playerCountChosen = false;
        boolean p1ChoiceValid = false;
        boolean p2ChoiceValid = false;
        int playerCount = 0;
        // these variables will be chosen by the player and will determine their constellations
        String player1Choice = "";
        String player2Choice = "";
        // based on the chosen constellation and the chosen stats, these arrays will contain the stats when it's time to BATTLE
        int[] player1Stats = new int[7];
        int[] player2Stats = new int[7];
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
        // looping to make sure player 1 inserts an acceptable choice
        while (!p1ChoiceValid) {
            System.out.println("Player 1 Choice:");
            player1Choice = scan.nextLine();
            p1ChoiceValid = characterValid(constellationNames,player1Choice);
            if (!p1ChoiceValid) {
                System.out.println("That was not one of the options. Pick again.");
            }
        }
        userStats(player1Stats,player1Choice);
        // if there are two players, program will also scan for a second choice of being
        if (playerCount == 2) {
            // looping to make sure that player 2 inserts an acceptable choice
            while (!p2ChoiceValid) {
                System.out.println("Player 2 Choice:");
                player2Choice = scan.nextLine();
                p2ChoiceValid = characterValid(constellationNames,player2Choice);
                if (!p2ChoiceValid) {
                    System.out.println("That was not one of the options. Pick again.");
                }
            }
        }
        userStats(player2Stats,player2Choice);

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
    // creating a method that calls
    public static int[] userStats (int[] stats, String userChoice) {
        if (userChoice.equalsIgnoreCase("Aquila")) {
            Aquila player = new Aquila();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Astra")) {
            Astra player = new Astra();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Cancer")) {
            Cancer player = new Cancer();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Canis Major")) {
            Canis_Major player = new Canis_Major();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Capricornus")) {
            Capricornus player = new Capricornus();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Leo")) {
            Leo player = new Leo();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Lyra")) {
            Lyra player = new Lyra();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Pisces")) {
            Pisces player = new Pisces();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        } else if (userChoice.equalsIgnoreCase("Scorpius")) {
            Scorpius player = new Scorpius();
            stats[0] = player.Speed(stats[0]);
            stats[1] = player.Agility(stats[1]);
            stats[2] = player.Durability(stats[2]);
            stats[3] = player.Attack(stats[3]);
            stats[4] = player.Gravity(stats[4]);
            stats[5] = player.Light(stats[5]);
            stats[6] = player.Endurance(stats[6]);
        }
        return stats;
    }
}
