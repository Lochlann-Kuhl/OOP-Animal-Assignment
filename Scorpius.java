public class Scorpius extends Constellation{
    public int Speed(int Spd) {
        int SpdMod = 0;
        return super._Speed(Spd, SpdMod);
    }
    public int Agility(int Agl) {
        int AglMod = 2;
        return super._Agility(Agl, AglMod);
    }
    public int Durability(int Dur) {
        int DurMod = 4;
        return super._Durability(Dur, DurMod);
    }
    public int Attack(int Atk) {
        int AtkMod = 4;
        return super._Attack(Atk, AtkMod);
    }
    public int Gravity(int Grv) {
        int GrvMod = -3;
        return super._Gravity(Grv, GrvMod);
    }
    public int Light(int Lit) {
        int LitMod = -3;
        return super._Light(Lit, LitMod);
    }
    public int Endurance(int Edr) {
        int EdrMod = 3;
        return super._Endurance(Edr, EdrMod);
    }
}
