package legacy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int choice, lvl = 0, exp = 0, expmax = 50,dmg = 5;
        MoreExp expnew;
        Lvlup lvlnew;
        Scanner input = new Scanner (System.in);
        do{
            System.out.println("Nome: Josefos");
            System.out.println("Lvl: " + lvl);
            System.out.println("ExP: " + exp + " / " + expmax);
            
            System.out.println("1 - Elevar de nível");
            System.out.println("2 - Dar dano");
            System.out.println("3 - Ganhar Xp");
            System.out.println("0 - Fechar programa");
            System.out.print("Choose: ");
            
            choice = input.nextInt();

            switch(choice){
                case 1:
                    lvlnew = new Lvlup(lvl);
                    lvl = lvlnew.getLvl();
                    expmax += 50;
                    break;
                case 2:

                    break;
                case 3:
                    expnew = new MoreExp(exp, expmax);
                    exp = expnew.getExp();
                    if (exp == 0) {
                        expmax += 50;
                        lvlnew = new Lvlup(lvl);
                        lvl = lvlnew.getLvl();
                    }
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Valor inexistente");
                    break;
            }

        } while(choice != 0);
        input.close();
    }

}