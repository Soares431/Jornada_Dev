package Utils.Structure;

import Utils.Menu.CLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class Support {

    // Fora de Execução
    static public void Clear_Screen() {
        try {
            String sistemaOperacional = System.getProperty("os.name");

            if (sistemaOperacional.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela");
        }
    }

    static public void Sleep(long time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Erro" + e.getMessage());
        }
    }

    static public String KeyForContinue(Scanner input) {

        CLI.underscore();
        System.out.println("Pressione Qualquer tecla para continuar: ");
        String name = input.nextLine();
        return name;

    }

}
