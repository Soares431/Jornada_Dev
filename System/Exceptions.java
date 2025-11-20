package System;
import Utils.Menu.GUI;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {

    static public int InputInterger(Scanner input){

        int numero;
        while(true){
            try{
                return input.nextInt();

            } catch (InputMismatchException e){
                GUI.ShowMessageAlert("Digite apenas números!");
                input.nextLine();
            }
        }
    }
}
