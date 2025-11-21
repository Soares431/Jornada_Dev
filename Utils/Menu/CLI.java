package Utils.Menu;

import Models.Activity;
import Models.Player;

import java.util.ArrayList;
import java.util.Scanner;
import Utils.Structure.Support;

public final class CLI {
    static public void Lobby_Information(Player player) {
        underscore();
        System.out.printf(
                "Nome: %s | XP: %.1f \n| Network: %d | Comunicação: %d | Algoritmos: %d \n| Bancos de Dados: %d | Pensamento lógico : %d | Arquitetura de Software: %d\n",
                player.getName(),
                player.getXp(),
                player.getNetwork_quantity(),
                player.getCommunication(),
                player.getAlgorithms(),
                player.getDatabases(),
                player.getLogical_thinking(),
                player.getSoftware_architecture()
        );
        underscore();
    }

    static public String Requesting_Player_Name(Scanner in){
        System.out.println("Digite o seu nome: ");
        return in.nextLine();
    }

    static public void Show_Activitys( ArrayList<Activity> activities){

        for (int i = 0; i < activities.size(); i++) {
            System.out.printf("%d - %s \n", i + 1, activities.get(i).toString());
        }

    }

    static public void  Menu_Presentation(String name){
        Support.Sleep(0);
        Support.Clear_Screen(); // Não funciona por hora
        underscore();
        System.out.println("\nBEM VINDO!\n");
        underscore();
    }

    static public void underscore(){
        System.out.println("----------------------------------------------------------");
    }




}
