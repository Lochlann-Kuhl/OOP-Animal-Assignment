import java.util.ArrayList;
import java.util.Objects;

public class TempMethod {
    public static int[] aiStats (int levelNum){
        int[] aiStats = new int[7];
        for(int i = 0; i<= 6; i++){
            aiStats[i] = (int)(Math.random()*3)+levelNum;
        }
        for(int h = 0; h <= 6; h++){
            System.out.println(aiStats[h]);
        }
        return aiStats;
    }
}
