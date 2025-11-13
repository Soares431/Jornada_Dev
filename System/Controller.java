package System;

import Models.Activity;
import Models.Level;
import Models.Player;
import Utils.Jpanel.GUI;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
    }

    public void inicialize() {
        Scanner input = new Scanner(System.in);
        String name = "Kujikun";
        String occupation = "INICIANTE";
        int level = 0;
        double xp = 0;
        int network = 0;

        Player player = new Player(name, occupation, level, xp, network);
        Level level1 = Level.INICIANTE;
        GUI.menuPresentation(player,level1.getActivitys() );

        while (true) {
            int i = 1;
            GUI.Menuinformations(player);

            for (Activity activity : level1.getActivitys()) {
                System.out.printf("%d - %s \n", i, activity.toString());
                i += 1;
            }
            String a = input.nextLine();
        }


    }


}
