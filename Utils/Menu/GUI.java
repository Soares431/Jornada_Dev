package Utils.Menu;

import Models.Activity;
import Models.Player;

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

    static public void menuPresentation(Player player) {
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
                MainMenu(player);
            }
        });

        // Painel principal com BorderLayout
        JPanel painelMain = new JPanel(new BorderLayout());
        painelMain.setBackground(Color.DARK_GRAY);

        // Título
        JLabel labelName = new JLabel("<html><h1>História do <Name_Player> da Silva Oliveira</h1></html>", SwingConstants.CENTER);
        labelName.setForeground(Color.WHITE);
        labelName.setFont(new Font("Arial", Font.BOLD, 20));

        // Texto de apresentação
        JLabel labelPresentation = new JLabel(
                "<html>" +
                        "<p style='text-align:center;'> <Name_Player> da Coreia do Norte tentando uma vida de cantor.<br>" +
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



    static private void MainMenu(Player player) {
        List<Activity> activityList = player.getAvailableActivities();

        JFrame mainMenu = new JFrame("Lobby");
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setSize(450, 250);

        mainMenu.setLayout(new BorderLayout());

        JPanel panelMain = new JPanel(new BorderLayout());
        panelMain.setBackground(Color.darkGray);

        JLabel titulo = new JLabel("Lobby", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);

        JLabel statuPlayer = new JLabel();
        statuPlayer.setForeground(Color.white);
        statuPlayer.setFont(new Font("Arial", Font.PLAIN, 18));

        // Atualiza o texto do status
        statuPlayer.setText(String.format(
                "<html>Ocupação Atual: %s | XP: %.1f / %.1f | Nível: %d | NetWork: %d<br></html>",
                player.getOccupation(),
                player.getXp(),
                player.getXpNeeded(),
                player.getLevel(),
                player.getNetwork_quantity()
        ));

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

        for (int idx = 0; idx < activityList.size(); idx++) {
            int indexFinal = idx;

            panelMain.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(String.valueOf(idx + 1)), "tecla" + (idx + 1));

            panelMain.getActionMap().put("tecla" + (idx + 1), new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Activity a = activityList.get(indexFinal);

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

                    // 🔥 Quando sobe de nível, o menu precisa atualizar!
                    if (player.getXp() == 0) {
                        mainMenu.dispose();
                        MainMenu(player); // ← CHAMA DE NOVO PARA ATUALIZAR ATIVIDADES!
                    }
                }
            });
        }

        mainMenu.setVisible(true);
    }

    static public void ShowMessageAlert(String mensage){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true); // garante que fique na frente

        JOptionPane.showMessageDialog(
                frame,
                mensage,
                "AVISO!",
                JOptionPane.WARNING_MESSAGE
        );

        frame.dispose();
    }
}
