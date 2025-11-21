package System;
import Utils.Menu.GUI;
import java.awt.Desktop;
import java.net.URI;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {

    static public int InputInterger(Scanner input){
        while(true){
            try{
                return input.nextInt();

            } catch (InputMismatchException e){
                GUI.ShowMessageAlert("Digite apenas números!");
                input.nextLine();
            }
        }

    }

    static public void OpenLinkStardewVally(){
        try{
            URI link = new URI("https://pt.stardewvalleywiki.com/Stardew_Valley_Wiki");
            // Verifica se o Desktop é suportado
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(link);
            } else {
                System.out.println("Não é possível abrir o navegador no seu sistema.");
            }
        }catch (Exception e){
            System.out.println("Erro para acessar" + e.getMessage() );
        }
    }
}
