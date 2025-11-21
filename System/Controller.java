package System;

import Models.Activity;
import Models.Level;
import Models.Player;
import Models.Skill;
import Utils.Menu.*;
import Utils.Structure.Support;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Controller {
    static Scanner input = new Scanner(System.in);
    static Exceptions ex = new Exceptions();
    static Random rand = new Random();

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
        GUI.Menu_Presentation(player,player.getName());
        CLI.Menu_Presentation(player.getName());;
        Support.KeyForContinue(input);
        Support.Clear_Screen(); 
        CLI.Tutorial(input);
    }

    public void Choose_Activity() {

        CLI.underscore();
        System.out.print("O que você quer fazer agora? ");

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
        int time_random = rand.nextInt(3, 6);
       
        ArrayList<Activity> Current_level_activity_list = level_current.getActivities();
        Activity activity_current = Current_level_activity_list.get(choose_task);
        Support.Clear_Screen();     
        CLI.underscore();
        System.out.printf("VOCE ESTA FAZENDO: %s\n", activity_current.getDescricao());
        System.out.println("Atividade em Andamento...");
        CLI.underscore();
        Support.Sleep(time_random);
        System.out.println("TAREFA FEITA COM SUCESSO!\nHabilidade(s) adquirida(s):\n");
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
        Support.KeyForContinue(input);
        Support.Clear_Screen(); 
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

    static public boolean Probability_Showing_Letter(String name){
    
        boolean choose = false;
        int num_rand = rand.nextInt(1) + 1; // 1 a 1000
        int num_acerto = 1;

        if(num_rand == num_acerto){
            choose = GUI.showCarta(name);
        }

        return choose;

    }

}