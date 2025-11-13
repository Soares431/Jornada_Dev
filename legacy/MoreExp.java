package legacy;

public class MoreExp {
    private int exp, expmax;

    public MoreExp (int exp, int expmax){
        this.exp = exp;
        this.expmax = expmax;
    }

    public int getExp(){
        exp += 5;
        if(exp >= expmax){
            exp = 0;
        }
        return exp;
    }
}
