package Models;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character {

    private int level = 1;
    private double xp;
    private double xpNeeded = 100;
    // Habilidade
    private int network_quantity;
    private int communication;
    private int algorithms;
    private int databases;
    private int logical_thinking;
    private int software_architecture;
    private Models.Level levelData;

    public Player(String nome, int num_level, double xp, Level level1) {
        super(nome, level1.name());
        this.level = num_level;
        this.xp = xp;
        this.xpNeeded = level1.getXpForNext();
        this.network_quantity = this.communication = this.algorithms = this.databases = this.logical_thinking = this.software_architecture = 0;
        this.levelData = level1;
    }

    public void updateOccupation() {
        // Agora usamos o nome do Level.java automaticament
        setOccupation(levelData.getName()); // 🔥 ALTERADO
    }

    public List<Activity> getAvailableActivities() {
        return levelData.getActivities();
    }

    public int getLevel() {
        return level;
    }

    public double getXpNeeded() {
        return xpNeeded;
    }

    // Elevar o jogador de nível
    public void levelUp() {
        level++;
        xp = 0;
        xpNeeded = xpNeeded * 1.5;

        updateLevelData();
        updateOccupation();
    }

    private void updateLevelData() {
        switch (level) {
            case 1 -> levelData = Level.ESTUDANTE;
            case 2 -> levelData = Level.ESTAGIARIO;
            case 3 -> levelData = Level.JUNIOR;
            case 4 -> levelData = Level.PLENO;
            case 5 -> levelData = Level.SENIOR;
            case 6 -> levelData = Level.TECH_LEAD;
            case 7 -> levelData = Level.CEO;
            default -> levelData = Level.ESTUDANTE;
        }
    }

    public void setLevel(int level) {
        this.level = level;
        updateLevelData();
        updateOccupation();
    }

    public Level getLevelData() {
        return levelData;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    //Habilidades
    public int getNetwork_quantity() {
        return network_quantity;
    }

    public void setNetwork_quantity(int network_quantity) {
        network_quantity = network_quantity;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(int algorithms) {
        this.algorithms = algorithms;
    }

    public int getDatabases() {
        return databases;
    }

    public void setDatabases(int databases) {
        this.databases = databases;
    }

    public int getLogical_thinking() {
        return logical_thinking;
    }

    public void setLogical_thinking(int logical_thinking) {
        this.logical_thinking = logical_thinking;
    }

    public int getSoftware_architecture() {
        return software_architecture;
    }

    public void setSoftware_architecture(int software_architecture) {
        this.software_architecture = software_architecture;
    }


}
