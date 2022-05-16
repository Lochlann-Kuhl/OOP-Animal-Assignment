import java.util.Objects;

public class TempMethod {
    public static int compare(String map, int[] p1Stat, int [] p2Stat){
        double[] WinWeight = new double[7];
        double p1Wins = 0;
        double p2Wins = 0;
        int whoWon;

        if (map.equals("Aether")) {
            Aether a = new Aether();
            WinWeight[0] = (a.aglWeight());
            WinWeight[1] = (a.spdWeight());
            WinWeight[2] = (a.durWeight());
            WinWeight[3] = (a.atkWeight());
            WinWeight[4] = (a.grvWeight());
            WinWeight[5] = (a.litWeight());
            WinWeight[6] = (a.edrWeight());
        }
        else if (map.equals("AsteroidField")) {
            AsteroidField b = new AsteroidField();
            WinWeight[0] = (b.aglWeight());
            WinWeight[1] = (b.spdWeight());
            WinWeight[2] = (b.durWeight());
            WinWeight[3] = (b.atkWeight());
            WinWeight[4] = (b.grvWeight());
            WinWeight[5] = (b.litWeight());
            WinWeight[6] = (b.edrWeight());
        }
        else if (map.equals("Atmosphere")) {
            Atmosphere c = new Atmosphere();
            WinWeight[1] = (c.aglWeight());
            WinWeight[2] = (c.spdWeight());
            WinWeight[3] = (c.durWeight());
            WinWeight[4] = (c.atkWeight());
            WinWeight[5] = (c.grvWeight());
            WinWeight[6] = (c.litWeight());
            WinWeight[7] = (c.edrWeight());
        }
        else if (map.equals("BlackHole")) {
            BlackHole d = new BlackHole();
            WinWeight[1] = (d.aglWeight());
            WinWeight[2] = (d.spdWeight());
            WinWeight[3] = (d.durWeight());
            WinWeight[4] = (d.atkWeight());
            WinWeight[5] = (d.grvWeight());
            WinWeight[6] = (d.litWeight());
            WinWeight[7] = (d.edrWeight());
        }
        else if (map.equals("Nebula")) {
            Nebula e = new Nebula();
            WinWeight[1] = (e.aglWeight());
            WinWeight[2] = (e.spdWeight());
            WinWeight[3] = (e.durWeight());
            WinWeight[4] = (e.atkWeight());
            WinWeight[5] = (e.grvWeight());
            WinWeight[6] = (e.litWeight());
            WinWeight[7] = (e.edrWeight());
        }
        else if (map.equals("SpaceStation")) {
            SpaceStation f = new SpaceStation();
            WinWeight[1] = (f.aglWeight());
            WinWeight[2] = (f.spdWeight());
            WinWeight[3] = (f.durWeight());
            WinWeight[4] = (f.atkWeight());
            WinWeight[5] = (f.grvWeight());
            WinWeight[6] = (f.litWeight());
            WinWeight[7] = (f.edrWeight());
        }
        for(int i = 1; i <=7; i++){
            if (p1Stat[i] > p2Stat[i]){
                p1Wins = p1Wins + (1 * WinWeight[i]);
            }
            else if (p1Stat[i] < p2Stat[i]) {
                p2Wins = p2Wins + (1 * WinWeight[i]);
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
