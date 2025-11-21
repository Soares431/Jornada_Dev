package System;

import Utils.Menu.CLI;
import Utils.Menu.GUI;

public class MainProgram {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.inicialize();

        while (controller.player.getLevel() < 8) {
            CLI.Lobby_Information(controller.player);
            CLI.Show_Activitys(controller.level_current.getActivities());
            controller.Choose_Activity();
        }
        GUI.ShowMessageAlert("Você Finalazou o jogo!");
        System.out.println("Jogo encerrado");

    }

}
