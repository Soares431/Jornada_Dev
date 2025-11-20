package Utils.Structure;

import Utils.Menu.CLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class Support {

    // Fora de Execução
    static public void Clear_Screen() {
//        try {
//            String os = System.getProperty("os.name");
//            if (os.contains("Windows")) {
//                // Para Windows
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                // Ou: Runtime.getRuntime().exec("cls");
//            } else {
//                // Para Linux e macOS
//                Runtime.getRuntime().exec("clear");
//            }
//        } catch (Exception exception) {
//            // Lide com a exceção
//            System.err.println("Erro ao limpar a tela: " + exception.getMessage());
//        }
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
