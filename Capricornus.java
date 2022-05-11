public class Capricornus extends Constellation{

    public int Speed(int Spd) {
        return (-4 + super.Spd);
    }
    public int CapAgility(int Agl) {
        return (-2 + super.Agl);
    }
    public int Durability(int Dur) {
        return (-3 + super.Dur);
    }
    public int Attack(int Atk) {
        return (super.Atk);
    }
    public int Gravity(int Grv) {
        return (1 + super.Grv);
    }
    public int Light(int Lit) {
        return (4 + super.Lit);
    }
    public int Endurance(int Edr) {
        return (-3 + super.Edr);
    }
}
