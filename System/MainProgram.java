package System;

import Utils.Menu.CLI;
import Utils.Menu.GUI;

import System.Exceptions;

public class MainProgram {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.inicialize();
        boolean go_place = false;
       do {
            CLI.Lobby_Information(controller.player);
            CLI.Show_Activitys(controller.level_current.getActivities());
            controller.Choose_Activity();
            go_place = Controller.Probability_Showing_Letter(controller.player.getName());
        } while(controller.player.getLevel() < 7 && !go_place);

        if(go_place){
            GUI.ShowMessageAlert("VOCE ESCOLHEU O FINAL ALTERNATIVO");
            Exceptions.OpenLinkStardewVally();
    
        }
        else{
            GUI.ShowMessageAlert("PARABENS CEO!");
        }

        System.out.println("Sistema Encerrado!\n");

    }

}
