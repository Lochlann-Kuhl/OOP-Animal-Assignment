public class Constellation {

    public String goodname;
    public int Atk;
    public int Dur;
    public int Spd;
    public int Agl;
    public int Grv;
    public int Lit;
    public int Edr;

    public Constellation(String name) {
        this.goodname = name;
    }
    public int Attack(int input) {
        return this.Atk = input;
    }
    public int Durability(int input) {
        return this.Dur = input;
    }
    public int Speed(int input) {
        return this.Spd = input;
    }
    public int Agility(int input) {
        return this.Agl = input;
    }
    public int Gravity(int input) {
        return this.Grv = input;
    }
    public int Light(int input) {
        return this.Lit = input;
    }
    public int Endurance(int input) {
        return this.Edr = input;
    }
}