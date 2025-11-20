package System;

import Utils.Menu.CLI;

public class MainProgram {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.inicialize();

        while (true) {
            CLI.Lobby_Information(controller.player);
            CLI.Show_Activitys(controller.level_current.getActivities());
            controller.Choose_Activity();

        }

    }

}
