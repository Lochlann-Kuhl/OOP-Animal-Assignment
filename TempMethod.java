import java.util.Objects;

public class TempMethod {
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
