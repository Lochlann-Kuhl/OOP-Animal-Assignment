import java.util.ArrayList;

abstract class Environment implements Defined_Environment_Classes{
    public double spdWeight() { return 1; }

    public double aglWeight() { return 1;}

    public double durWeight() { return 1;}

    public double atkWeight() { return 1; }

    public double grvWeight() { return 1; }

    public double litWeight() { return 1; }

    public double edrWeight() { return 1; }

    // randomly generates an environment from an arraylist
    // removes that environment from the arraylist, so it cannot be repeated
    public static String envGen (ArrayList<String> envList) {
        String envSelect;
        int iSelectEnv;
        iSelectEnv = (int)(Math.random()*8);
        envSelect = envList.get(iSelectEnv);
        envList.remove(envSelect);
        return envSelect;
    }

}
