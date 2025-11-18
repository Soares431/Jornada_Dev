package Models;

public class Player extends Character {

    private int level = 1;
    private double xp;
    private double xpNeeded = 100;
    private int Network_quantity;

    public Player(String name, String occupation, int level, double xp, int Network_quantity) {
        super(name, occupation);
        this.level = level;
        this.xp = xp;
        this.Network_quantity = Network_quantity;
    }

    // Para mudar a Ocupação do player
    public void updateOccupation() {

        int level = this.level;

        switch (level) {
            case 1:
                setOccupation("INICIANTE");
                break;

            case 2:
                setOccupation("ESTUDANTE");
                break;
            case 3:
                setOccupation("FREELANCER");
                break;

            case 4:
                break;

        }

    }

    public int getLevel() {
        return level;
    }

    public double getXpNeeded() {
        return xpNeeded;
    }

    // Elevar o jogador de nível
    public void levelUp() {
        this.level++;
        this.xp = 0;
        this.xpNeeded = this.xpNeeded * 1.5;

        updateOccupation();
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
