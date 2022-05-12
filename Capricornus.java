public class Capricornus extends Constellation{
    public int Speed(int Spd) {
        int SpdMod = -4;
        return super.Speed(Spd, SpdMod);
    }
    public int Agility(int Agl) {
        int AglMod = -2;
        return super.Agility(Agl, AglMod);
    }
    public int Durability(int Dur) {
        int DurMod = -3;
        return super.Durability(Dur, DurMod);
    }
    public int Attack(int Atk) {
        int AtkMod = 0;
        return super.Attack(Atk, AtkMod);
    }
    public int Gravity(int Grv) {
        int GrvMod = 1;
        return super.Gravity(Grv, GrvMod);
    }
    public int Light(int Lit) {
        int LitMod = 4;
        return super.Light(Lit, LitMod);
    }
    public int Endurance(int Edr) {
        int EdrMod = -3;
        return super.Endurance(Edr, EdrMod);
    }
}
