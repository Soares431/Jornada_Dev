package System;

import Models.Activity;
import Models.Level;
import Models.Player;
import Models.Skill;
import Utils.Menu.*;
import Utils.Structure.Support;

import java.awt.*;
import java.util.ArrayList;
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

        name = GUI.Requesting_Player_Name();
        level_num = 1;
        xp = 0;
        level_current = Level.ESTUDANTE; // level - 1
        player = new Player(name, level_num, xp, level_current);
        GUI.menuPresentation(player,player.getName());
        CLI.Menu_Presentation(player.getName());
    }

    public void Choose_Activity() {

        System.out.print("Diga a Sua Atividade: ");

        int choose = ex.InputInterger(input) - 1; // o -1 é para diminuir de acordo com a quantidade de elementos
        int size_Activities = level_current.getActivities().size();

        while (choose < 0 || choose >= size_Activities) {
            CLI.underscore();
            GUI.ShowMessageAlert("OPÇAO INVALIDA");
            choose = ex.InputInterger(input) - 1;
        }

        Executing_Task(choose);

    }

    private void Executing_Task(int choose_task) {
        Support.Clear_Screen();
        ArrayList<Activity> Current_level_activity_list = level_current.getActivities();
        Activity activity_current = Current_level_activity_list.get(choose_task);

        CLI.underscore();
        System.out.printf("O que voce vai fazer: %s\n", activity_current.getDescricao());
        System.out.println("Atividade em Andamento...");
        CLI.underscore();
        System.out.println("Atividade Feita! Habilidade(s) adquirida(s):");
        for (Skill skill : activity_current.getSkill_point_gain()) {
            System.out.printf("%s  +%d\n", skill.getName(), skill.getPont_skills());
            player.addSkillPoints(skill);
        }

        double xpBase = activity_current.getActivity_value();
        double xpFinal = xpBase;

        // Se state == 1, aplica multiplicador
        if (activity_current.getState() == 1) {
            xpFinal = xpBase * 2;  // Buffe de XP
        }

        player.addXp(xpFinal);

        CLI.underscore();

        Current_level_activity_list.remove(activity_current);

        if (Current_level_activity_list.isEmpty()) {
            NextLevel();
        }
    }

    public void NextLevel() {
        Support.Clear_Screen();
        player.setLevel(player.getLevel() + 1);
        level_current = player.getLevelData();
        player.setXp(0);
        if(player.getLevel() < 8){
            GUI.LevelUpMensage(player);
        }



    }

}