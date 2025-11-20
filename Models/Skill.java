package Models;

public class Skill {

    private int indice;
    private String name;
    private int pont_skills;

    public Skill(int indice, String name, int pont_skills) {
        this.indice = indice;
        this.name = name;
        this.pont_skills = pont_skills;
    }

    public int getIndice() {
        return indice;
    }

    public String getName() {

        switch (getIndice()){

            case 1 -> name = "NETWORK";

            case 2 -> name = "COMUNICAÇÃO";

            case 3 -> name = "ESTRUTURAS DE DADOS E ALGORITMOS";

            case 4 -> name = "BANCOS DE DADOS";

            case 5 -> name = "PENSAMENTO LÓGICO";

            case 6 -> name = "ARQUITETURA DE SOFTWARE";
        }

        return name;
    }

    public int getPont_skills() {
        return pont_skills;
    }

    public void setPont_skills(int pont_skills) {
        this.pont_skills = pont_skills;
    }
}
