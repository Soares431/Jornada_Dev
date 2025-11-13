package legacy;

public class Lvlup{
    private int lvl;

    public Lvlup(int lvl){
        this.lvl = lvl;
    }

    public int getLvl(){
        lvl+=1;
        return lvl;
    }
}