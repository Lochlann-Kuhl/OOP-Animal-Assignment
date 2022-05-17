import java.util.*;
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        boolean playerCountChosen = false;
        boolean p1ChoiceValid = false; boolean p2ChoiceValid = false;
        int playerCount = 0;
        int player1pool = 10; int player2pool = 10;
        // these variables will be chosen by the player and will determine their constellations
        String player1Choice = ""; String player2Choice = "";
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
        // note: include some insult towards Capricornus
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
        System.out.println("Player 1, you have a pool of 10 points to add to your stats. " +
                "\n The stats are Speed, Agility, Durability, Attack, Gravity Control, Light, and Endurance. " +
                "\n As far as you know, each of the stats is currently set to 0 (but there are secret stats for each constellation)." +
                "\n You will not be allowed to subtract stats to gain back points, because if that was allowed then you could just get infinite points and that would be :skullemoji:" +
                "\n When you want to add to a stat, first type the stat you want to modify, and after that has been processed type the points you want to add." +
                "\n When you run out of points or type 'end', you will be taken out of the stats selection section." +
                "\n Now, to begin:");
        userChoice(player1Stats,player1pool);
        if (playerCount == 2) {
            System.out.println("Player 2, you have a pool of 10 points to add to your stats. " +
                    "\n The stats are Speed, Agility, Durability, Attack, Gravity Control, Light, and Endurance. " +
                    "\n As far as you know, each of the stats is currently set to 0 (but there are secret stats for each constellation)." +
                    "\n You will not be allowed to subtract stats to gain back points, because if that was allowed then you could just get infinite points and that would be :skullemoji:" +
                    "\n When you want to add to a stat, first type the stat you want to modify, and after that has been processed type the points you want to add." +
                    "\n When you run out of points or type 'end', you will be taken out of the stats selection section." +
                    "\n Now, to begin:");
                    userChoice(player2Stats,player2pool);
        }
        // this is just some debugging
        /*for (int i = 0; i<player1Stats.length; i++) {
            System.out.print(player1Stats[i] + "\t");
        }*/

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
    public static void userStats (int[] stats, String userChoice) {
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
    }
    public static void userChoice(int[] upStats, int playerPool) {
        // defining the variables within userChoice
        String statChoice = "";
        int statChange;
        boolean legStat;
        boolean legChange;
        boolean poolGone = false;
        while (!poolGone) {
            legStat = false;
            legChange = false;
            // looping it to make sure that the user has input a legitimate stat
            while (!legStat) {
                System.out.println("Which stat do you want to modify?");
                statChoice = scan.nextLine();
                if (statChoice.equalsIgnoreCase("Speed") || statChoice.equalsIgnoreCase("Agility") || statChoice.equalsIgnoreCase("Durability") || statChoice.equals("Attack") || statChoice.equalsIgnoreCase("Gravity") || statChoice.equalsIgnoreCase("Light") || statChoice.equalsIgnoreCase("Endurance")) {
                    legStat = true;
                } else {
                    System.out.println("That is not one of the allowed stats (Speed, Agility, Durability, Attack, Gravity, Light, Endurance)");
                }
            }
            // looping it to make sure the user has input a legitimate value
            while (!legChange) {
                System.out.println("How many stats do you want to add to " + statChoice + "?");
                statChange = scan.nextInt();
                scan.nextLine();
                if (playerPool < statChange) {
                    System.out.println("You do not have enough points in your pool (" + playerPool + ") to make that change. Please try again.");
                } else {
                    playerPool -= statChange;
                    legChange = true;
                    if (statChoice.equalsIgnoreCase("Speed")) {
                        upStats[0] += statChange;
                        //System.out.println(statChoice + " = " + upStats[0]);
                    } else if (statChoice.equalsIgnoreCase("Agility")) {
                        upStats[1] += statChange;
                        //System.out.println(statChoice + " = " + upStats[1]);
                    } else if (statChoice.equalsIgnoreCase("Durability")) {
                        upStats[2] += statChange;
                        //System.out.println(statChoice + " = " + upStats[2]);
                    } else if (statChoice.equalsIgnoreCase("Attack")) {
                        upStats[3] += statChange;
                        //System.out.println(statChoice + " = " + upStats[3]);
                    } else if (statChoice.equalsIgnoreCase("Gravity")) {
                        upStats[4] += statChange;
                        //System.out.println(statChoice + " = " + upStats[4]);
                    } else if (statChoice.equalsIgnoreCase("Light")) {
                        upStats[5] += statChange;
                        //System.out.println(statChoice + " = " + upStats[5]);
                    } else if (statChoice.equalsIgnoreCase("Endurance")) {
                        upStats[6] += statChange;
                        //System.out.println(statChoice + " = " + upStats[6]);
                    }
                }
            }
            System.out.println("Your pool is now " + playerPool);
            if (playerPool <= 0) {
                poolGone = true;
            }
        }
    }
}
