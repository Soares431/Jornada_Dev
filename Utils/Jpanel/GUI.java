package Utils.Jpanel;

import Models.Activity;
import Models.Player;
import Models.Level;

import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private static void checkLevelUp(Player player) {
        if (player.getXp() >= player.getXpNeeded()) {
            player.levelUp();

            JOptionPane.showMessageDialog(null,
                    "Você subiu para o nível " + player.getLevel() + "!",
                    "LEVEL UP!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static public void menuPresentation(Player player, List<Activity> activityList) {
        JFrame frame = new JFrame("Welcome!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 300);
        frame.setLayout(new BorderLayout());

        // Botão
        JButton botaoOK = new JButton("Seguir");
        botaoOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainMenu(player, activityList);
            }
        });

        // Painel principal com BorderLayout
        JPanel painelMain = new JPanel(new BorderLayout());
        painelMain.setBackground(Color.DARK_GRAY);

        // Título
        JLabel labelName = new JLabel("<html><h1>História do Kujikun da Silva Oliveira</h1></html>", SwingConstants.CENTER);
        labelName.setForeground(Color.WHITE);
        labelName.setFont(new Font("Arial", Font.BOLD, 20));

        // Texto de apresentação
        JLabel labelPresentation = new JLabel(
                "<html>" +
                        "<p style='text-align:center;'>Kujikun fugiu da Coreia do Norte tentando uma vida de cantor.<br>" +
                        "Veio para o Brasil, fez um passaporte falso e se tornou Kujikun da Silva Oliveira.<br>" +
                        "Tentou virar MC de rap, mas era péssimo cantor.<br>" +
                        "Se apaixonou por Melissa, que estudava programação.<br>" +
                        "E assim entrou na área de TI e virou programador.<br></p>" +
                        "</html>"
        );
        labelPresentation.setForeground(Color.WHITE);
        labelPresentation.setFont(new Font("Arial", Font.PLAIN, 16));
        labelPresentation.setHorizontalAlignment(SwingConstants.CENTER);

        // Painel para centralizar texto
        JPanel painelTexto = new JPanel(new BorderLayout());
        painelTexto.setBackground(Color.DARK_GRAY);
        painelTexto.add(labelName, BorderLayout.NORTH);
        painelTexto.add(labelPresentation, BorderLayout.CENTER);

        // Painel do botão centralizado na parte inferior
        JPanel painelBotao = new JPanel();
        painelBotao.setBackground(Color.DARK_GRAY);
        painelBotao.add(botaoOK);

        // Adiciona tudo ao painel principal
        painelMain.add(painelTexto, BorderLayout.CENTER);
        painelMain.add(painelBotao, BorderLayout.SOUTH);

        // Adiciona o painel principal ao frame
        frame.add(painelMain, BorderLayout.CENTER);

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static public void Menuinformations(Player player) {
        System.out.println("----------------------------------------------------------");
        System.out.printf("Ocupacao Atual: %s | XP: %.1f | NetWork: %d\n", player.getOccupation(), player.getXp(), player.getNetwork_quantity());
        System.out.println("----------------------------------------------------------");

    }

    private static void MainMenu(Player player, List<Activity> activityList) {
        JFrame mainMenu = new JFrame("Lobby");
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setSize(450, 250);


        mainMenu.setLayout(new BorderLayout());

        JPanel panelMain = new JPanel(new BorderLayout());
        panelMain.setBackground(Color.darkGray);

        JLabel titulo = new JLabel("Lobby", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);

        String textoStatus = String.format(
                "<html>Ocupação Atual: %s | XP: %.1f | NetWork: %d<br></html>",
                player.getOccupation(),
                player.getXp(),
                player.getNetwork_quantity()
        );

        JLabel statuPlayer = new JLabel(textoStatus, SwingConstants.CENTER);
        statuPlayer.setForeground(Color.white);
        statuPlayer.setFont(new Font("Arial", Font.PLAIN, 18));

        StringBuilder sb = new StringBuilder("<html>");
        JLabel labelsActivitys = new JLabel();
        int i = 1;

        for (Activity activity : activityList) {
            sb.append(i)
                    .append(" - ")
                    .append(activity.toString())
                    .append("<br>"); // quebra de linha no JLabel
            i++;
        }

        sb.append("</html>");
        labelsActivitys.setText(sb.toString());
        labelsActivitys.setForeground(Color.WHITE);
        labelsActivitys.setFont(new Font("Arial", Font.PLAIN, 16));

        panelMain.add(titulo, BorderLayout.NORTH);
        panelMain.add(statuPlayer, BorderLayout.CENTER);
        panelMain.add(labelsActivitys, BorderLayout.SOUTH);

        mainMenu.add(panelMain, BorderLayout.CENTER);

        // interação com a tecla 1
        panelMain.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("1"), "tecla1");

        panelMain.getActionMap().put("tecla1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Activity a = activityList.get(0);

                player.setXp(player.getXp() + a.getActivity_value());
                checkLevelUp(player);

                statuPlayer.setText(String.format(
                        "<html>Ocupação Atual: %s | XP: %.1f / %.1f | Nível: %d | NetWork: %d<br></html>",
                        player.getOccupation(),
                        player.getXp(),
                        player.getXpNeeded(),
                        player.getLevel(),
                        player.getNetwork_quantity()
                ));
            }
        });

        //interação com a tecla 2
        panelMain.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("2"), "tecla2");

        panelMain.getActionMap().put("tecla2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Activity a = activityList.get(1);

                player.setXp(player.getXp() + a.getActivity_value());
                checkLevelUp(player);

                statuPlayer.setText(String.format(
                        "<html>Ocupação Atual: %s | XP: %.1f / %.1f | Nível: %d | NetWork: %d<br></html>",
                        player.getOccupation(),
                        player.getXp(),
                        player.getXpNeeded(),
                        player.getLevel(),
                        player.getNetwork_quantity()
                ));
            }
        });

        mainMenu.setVisible(true);
    }

}
