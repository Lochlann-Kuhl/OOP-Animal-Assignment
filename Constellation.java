public class Constellation {
    public int Spd;
    public int _Agl;
    public int Dur;
    public int Atk;
    public int Grv;
    public int Lit;
    public int Edr;
    public int Speed(int input) {
        return this.Spd = input;
    }
    public int Agility(int Agl) {
        this._Agl = Agl;
        return _Agl;
    }
    public int Durability(int input) {
        return this.Dur = input;
    }
    public int Attack(int input) {
        return this.Atk = input;
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