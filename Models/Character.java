package Models;

public abstract class Character {

    private String name;
    private String occupation;

    public Character(String nome, String occupation) {
        this.name = nome;
        this.occupation = occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getOccupation() {
        return occupation;
    }

    public void getOccupation(String posicao) {
        this.occupation = posicao;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "Cargo: " + this.occupation;
    }
}
