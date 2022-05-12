public class Capricornus extends Constellation{

    public int CapSpeed(int Spd) {
        return super.Speed(Spd-2);
    }
    public int CapAgility(int Agl) {
        return super.Agility(Agl-2);
    }
    public int CapDurability(int Dur) {
        return super.Durability(Dur-2);
    }
    public int CapAttack(int Atk) {
        return super.Attack(Atk-2);
    }
    public int CapGravity(int Grv) {
        return super.Gravity(Grv-2);
    }
    public int CapLight(int Lit) {
        return super.Light(Lit-2);
    }
    public int CapEndurance(int Edr) {
        return super.Endurance(Edr-2);
    }
}
