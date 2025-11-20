package System;

import Models.Activity;
import Models.Level;
import Models.Player;
import Models.Skill;
import Utils.Menu.*;
import Utils.Structure.Support;

import java.awt.*;
import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);
    static Exceptions ex = new Exceptions();

    public Player player;
    public String name;
    public int level_num;
    public double xp;
    public Level level_current;


    public void inicialize() {

//        name = CLI.Requesting_Player_Name(input);
        name = "Programador";
        level_num = 1;
        xp = 0;
        level_current = Level.ESTUDANTE; // level - 1
        player = new Player(name, level_num, xp, level_current);
        CLI.Menu_Presentation(player.getName());
    }

    public void Choose_Activity() {

        //Fazer o Jogador realizar um atividade
        // Esperar um tempo para que essa atividade seja feita
        // Recebe as Habilidades por essa Habilidade

        System.out.print("Diga a Sua Atividade: ");

        int choose = ex.InputInterger(input) -1 ; // o -1 é para diminuir de acordo com a quantidade de elementos
        int size_Activities = level_current.getActivities().size();

        while (choose < 0 || choose >= size_Activities) {

            GUI.ShowMessageAlert("OPÇAO INVALIDA");
        }

        Activity activity_curent = level_current.getActivities().get(choose);
        CLI.underscore();
        System.out.printf("O que voce vai fazer: %s\n", activity_curent.getDescricao());
        CLI.underscore();
        System.out.println("Atividadde em Andamento...");
        Support.Sleep(5);
        CLI.underscore();
        System.out.println("Atividade Feita! Habilidade(s) adquirida(s):");
        for(Skill skill: activity_curent.getSkill_point_gain()){
            System.out.printf("%s  +%d\n", skill.getName(), skill.getPont_skills());
        }
        CLI.underscore();
        level_current.getActivities().remove(activity_curent);
    }

}