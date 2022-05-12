public class Main {
    public static void main(String[] args){
        // testing --> to be deleted
        int lad;
        int lad2 = 5;
        Capricornus tommy = new Capricornus() ;
        lad = tommy.CapAgility(lad2);
        System.out.println(lad);
        // beginning of actual code
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
    }
}
