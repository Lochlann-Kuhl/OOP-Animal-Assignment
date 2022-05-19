import java.util.*;
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        boolean playerCountChosen = false;
        boolean p1ChoiceValid = false; boolean p2ChoiceValid = false;
        int playerCount = 0;
        int player1pool = 10; int player2pool = 10;
        String location = "Aether";
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
        // the following prints the instructions for the game
        System.out.println("Player 1, you have a pool of 10 points to add to your stats. " +
                "\n The stats are Speed, Agility, Durability, Attack, Gravity, Light, and Endurance. " +
                "\n As far as you know, each of the stats is currently set to 0 (but there are secret stats for each constellation)." +
                "\n You will not be allowed to subtract stats to gain back points, because if that was allowed then you could just get infinite points and that would be :skullemoji:" +
                "\n When you want to add to a stat, first type the stat you want to modify, and after that has been processed type the points you want to add." +
                "\n When you run out of points or type 'end', you will be taken out of the stats selection section." +
                "\n Now, to begin:");
        userChoice(player1Stats,player1pool);
        if (playerCount == 2) {
            // the following prints the instructions for the game
            System.out.println("Player 2, you have a pool of 10 points to add to your stats. " +
                    "\n The stats are Speed, Agility, Durability, Attack, Gravity, Light, and Endurance. " +
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
        int lad;
        lad = compare(location, player1Stats, player2Stats);
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
        // 'leg' stands for legitimate
        boolean legStat;
        boolean legChange;
        boolean poolGone = false;
        while (!poolGone) {
            legStat = false;
            legChange = false;
            // looping it to make sure that the user has input a legitimate stat
            while (!legStat) {
                System.out.println("Which stat do you want to modify? (please type full name)");
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
    public static int compare(String map, int[] p1Stat, int [] p2Stat){
        double[] WinWeight = new double[7];
        double p1Wins = 0;
        double p2Wins = 0;
        int whoWon;

        if (map.equalsIgnoreCase("Aether")) {
            Aether a = new Aether();
            WinWeight[0] = (a.aglWeight());
            WinWeight[1] = (a.spdWeight());
            WinWeight[2] = (a.durWeight());
            WinWeight[3] = (a.atkWeight());
            WinWeight[4] = (a.grvWeight());
            WinWeight[5] = (a.litWeight());
            WinWeight[6] = (a.edrWeight());
        }
        else if (map.equalsIgnoreCase("AsteroidField")) {
            AsteroidField b = new AsteroidField();
            WinWeight[0] = (b.aglWeight());
            WinWeight[1] = (b.spdWeight());
            WinWeight[2] = (b.durWeight());
            WinWeight[3] = (b.atkWeight());
            WinWeight[4] = (b.grvWeight());
            WinWeight[5] = (b.litWeight());
            WinWeight[6] = (b.edrWeight());
        }
        else if (map.equalsIgnoreCase("Atmosphere")) {
            Atmosphere c = new Atmosphere();
            WinWeight[0] = (c.aglWeight());
            WinWeight[1] = (c.spdWeight());
            WinWeight[2] = (c.durWeight());
            WinWeight[3] = (c.atkWeight());
            WinWeight[4] = (c.grvWeight());
            WinWeight[5] = (c.litWeight());
            WinWeight[6] = (c.edrWeight());
        }
        else if (map.equalsIgnoreCase("BlackHole")) {
            BlackHole d = new BlackHole();
            WinWeight[0] = (d.aglWeight());
            WinWeight[1] = (d.spdWeight());
            WinWeight[2] = (d.durWeight());
            WinWeight[3] = (d.atkWeight());
            WinWeight[4] = (d.grvWeight());
            WinWeight[5] = (d.litWeight());
            WinWeight[6] = (d.edrWeight());
        }
        else if (map.equalsIgnoreCase("Nebula")) {
            Nebula e = new Nebula();
            WinWeight[0] = (e.aglWeight());
            WinWeight[1] = (e.spdWeight());
            WinWeight[2] = (e.durWeight());
            WinWeight[3] = (e.atkWeight());
            WinWeight[4] = (e.grvWeight());
            WinWeight[5] = (e.litWeight());
            WinWeight[6] = (e.edrWeight());
        }
        else if (map.equalsIgnoreCase("SpaceStation")) {
            SpaceStation f = new SpaceStation();
            WinWeight[0] = (f.aglWeight());
            WinWeight[1] = (f.spdWeight());
            WinWeight[2] = (f.durWeight());
            WinWeight[3] = (f.atkWeight());
            WinWeight[4] = (f.grvWeight());
            WinWeight[5] = (f.litWeight());
            WinWeight[6] = (f.edrWeight());
        }
        for(int i = 1; i <=7; i++){
            if (p1Stat[i] > p2Stat[i] && p1Stat[i] - p2Stat[i] > 7){
                p1Wins = p1Wins + (2 * WinWeight[i]);
            }
            else if (p1Stat[i] > p2Stat[i] && p1Stat[i] - p2Stat[i] < 7){
                p1Wins = p1Wins + WinWeight[i];
            }
            else if (p1Stat[i] < p2Stat[i] && p2Stat[i] - p1Stat[i] > 7) {
                p2Wins = p2Wins + (2 * WinWeight[i]);
            }
            else if (p1Stat[i] < p2Stat[i] && p2Stat[i] - p1Stat[i] < 7) {
                p2Wins = p2Wins + WinWeight[i];
            }
        }
        if (p1Wins > p2Wins){
            whoWon = 1;
        }
        else if (p1Wins < p2Wins){
            whoWon = 2;
        }
        else{
            whoWon = 3;
        }
        return whoWon;
    }
}
