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
                "| Nome: %s | XP: %.1f | Cargo %s\n",
                player.getName(),
                player.getXp(),
                player.getLevelData().getName()
        );
        underscore();
        System.err.printf("HABILIDADES:\n" + 
                        "| Network: %d | Comunicação: %d |  Pensamento lógico: %d \n" + //
                        "| Bancos de Dados: %d | Algoritmos: %d | Arquitetura de Software: %d\n",  
                player.getNetwork_quantity(),
                player.getCommunication(),
                player.getLogical_thinking(),
                player.getDatabases(),
                player.getAlgorithms(),
                player.getSoftware_architecture());
        underscore();
    }

    static public String Requesting_Player_Name(Scanner in){
        System.out.println("Digite o seu nome: ");
        return in.nextLine();
    }

    static public void Show_Activitys( ArrayList<Activity> activities){

        System.err.println("Atividade(s) que você pode fazer: \n");
        for (int i = 0; i < activities.size(); i++) {
            System.out.printf("%d | %s \n", i + 1, activities.get(i).toString());
        }

    }

    static public void  Menu_Presentation(String name){
      
        Support.Clear_Screen(); // Não funciona por hora
        underscore();
        System.out.printf("\nBEM VINDO %s\n\n", name);
        underscore();
    }

    static public void Tutorial(Scanner input){
        text_clean("\nSUA META É SE TORNA UM CEO DA MICROSOFT!\n", input);
        text_clean("\nFaça as atividade e vá Subindo de cargo (Nivel)\nCada Atividade você irá Ganhar pontos de Habilidades e pontos de experiencia (XP)\n", input);
        text_clean("\nBoa Sorte Programador\n", input);
      
    }

    static public void underscore(){
     System.out.println("----------------------------------------------------------");
    }
    static public void underscore_with_text(String texto){
        underscore();
        System.out.println(texto);
        underscore();
    
    }

    static public void text_clean(String text, Scanner input){
        underscore_with_text(text);
        Support.KeyForContinue(input);
        Support.Clear_Screen(); 
    }

    




}
