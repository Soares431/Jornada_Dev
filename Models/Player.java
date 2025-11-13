package Models;

public class Player extends Character {

    private int level;
    private double xp;
    private int Network_quantity;

    public Player(String name, String occupation, int level, double xp  ,int Network_quantity) {
        super(name, occupation);
        this.level = level;
        this.xp = xp;
        this.Network_quantity = Network_quantity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public int getNetwork_quantity() {
        return Network_quantity;
    }

    public void setNetwork_quantity(int network_quantity) {
        Network_quantity = network_quantity;
    }
}
