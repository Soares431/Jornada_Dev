package Utils.Menu;

import Models.Activity;
import Models.Player;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    static public String Requesting_Player_Name() {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String nome = JOptionPane.showInputDialog(frame, "Digite seu nome:", "Bem Vindo!",
                JOptionPane.QUESTION_MESSAGE);

        frame.dispose();
        return nome;
    }

    static public void Menu_Presentation(Player player, String nome) {
        JFrame frame = new JFrame("Jornada do Dev");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // ========== PAINEL PRINCIPAL ==========
        JPanel painelMain = new JPanel(new BorderLayout());
        painelMain.setBackground(new Color(30, 30, 30));
        painelMain.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // ========== TÍTULO ==========
        JLabel labelName = new JLabel(
                String.format("<html><h1 style='color: #4CAF50;'>História de %s</h1></html>", nome),
                SwingConstants.CENTER);
        labelName.setForeground(new Color(76, 175, 80));
        labelName.setFont(new Font("Segoe UI", Font.BOLD, 28));
        labelName.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        // ========== CAIXA DE TEXTO COM ESTILO ==========
//      Painel cinza escuro
//      Com borda verde arredondada
        JPanel painelTextoWrapper = new JPanel(new BorderLayout());
        painelTextoWrapper.setBackground(new Color(45, 45, 45));
        painelTextoWrapper.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(76, 175, 80), 2, true),
                BorderFactory.createEmptyBorder(25, 30, 25, 30)));

        JLabel labelPresentation = new JLabel(
                String.format(
                        "<html>" +
                                "<div style='width: 680px; line-height: 1.6; color: #E0E0E0;'>" +
                                "<p style='margin-bottom: 15px;'><span style='color: #4CAF50; font-weight: bold; font-size: 16px;'>%s</span> "
                                +
                                "desceu do ônibus na rodoviária de Recife sem planos. " +
                                "Vinha de uma viagem pelo Nordeste fazendo bicos, e Recife virou parada " +
                                "porque o ônibus quebrou.</p>" +

                                "<p style='margin-bottom: 15px;'>Arrumou um quarto num hostel barato e trabalho numa lanchonete. "
                                +
                                "Durante um intervalo, viu um cara programando num notebook cheio de adesivos " +
                                "na praça. Curioso, puxou conversa. O programador trabalhava remoto, ganhava bem, " +
                                "tinha liberdade. <span style='color: #FFC107;'>Aquilo mexeu com %s.</span></p>" +

                                "<p style='margin-bottom: 15px;'>Naquela noite, ele pesquisou " +
                                "<span style='color: #2196F3; font-style: italic;'>\"como aprender programação\"</span> no celular. "
                                +
                                "Caiu num mundo novo: tutoriais gratuitos, histórias de autodidatas que mudaram " +
                                "de vida, possibilidades infinitas.</p>" +

                                "<p style='margin-bottom: 15px;'>Três meses depois, <span style='color: #4CAF50;'>%s</span> acorda às 5h para estudar antes do trabalho. "
                                +
                                "Aprendeu Python básico, fez pequenos exercícios, e agora está pronto para " +
                                "criar seu primeiro projeto de verdade.</p>" +

                                "<p style='margin-bottom: 0;'><span style='color: #FF5722; font-weight: bold;'>Hoje</span>, "
                                +
                                "com um notebook emprestado e muita determinação, ele começa " +
                                "a jornada para se tornar um programador reconhecido. " +
                                "<span style='color: #4CAF50; font-weight: bold;'>O caminho é longo, mas ele acabou de dar o primeiro passo.</span></p>"
                                +
                                "</div>" +
                                "</html>",
                        nome, nome, nome));
        labelPresentation.setForeground(new Color(224, 224, 224));
        labelPresentation.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        labelPresentation.setVerticalAlignment(SwingConstants.TOP);

        painelTextoWrapper.add(labelPresentation, BorderLayout.CENTER);

        // ========== PAINEL DE CONTEÚDO ==========
        JPanel painelTexto = new JPanel(new BorderLayout());
        painelTexto.setBackground(new Color(30, 30, 30));
        painelTexto.add(labelName, BorderLayout.NORTH);
        painelTexto.add(painelTextoWrapper, BorderLayout.CENTER);

        // ========== BOTÃO ESTILIZADO ==========
        JButton botaoOK = new JButton("Começar Jornada →");
        botaoOK.setFont(new Font("Segoe UI", Font.BOLD, 16));
        botaoOK.setPreferredSize(new Dimension(200, 45));
        botaoOK.setBackground(new Color(76, 175, 80));
        botaoOK.setForeground(Color.WHITE);
        botaoOK.setFocusPainted(false);
        botaoOK.setBorderPainted(false);
        botaoOK.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botaoOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoOK.setBackground(new Color(67, 160, 71)); // Verde mais escuro
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoOK.setBackground(new Color(76, 175, 80)); // Verde original
            }
        });

        botaoOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // MainMenu(player); Fora de uso
            }
        });

        // ========== PAINEL DO BOTÃO ==========
        JPanel painelBotao = new JPanel();
        painelBotao.setBackground(new Color(30, 30, 30));
        painelBotao.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        painelBotao.add(botaoOK);

        // ========== MONTAGEM FINAL ==========
        painelMain.add(painelTexto, BorderLayout.CENTER);
        painelMain.add(painelBotao, BorderLayout.SOUTH);
        frame.add(painelMain, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // static private void Lobby(Player player) {
    //     List<Activity> activityList = player.getAvailableActivities();

    //     JFrame mainMenu = new JFrame("Status de " + player.getName());
    //     mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     mainMenu.setSize(450, 250);

    //     mainMenu.setLayout(new BorderLayout());

    //     JPanel panelMain = new JPanel(new BorderLayout());
    //     panelMain.setBackground(Color.darkGray);

    //     JLabel titulo = new JLabel("Lobby", SwingConstants.CENTER);
    //     titulo.setFont(new Font("Arial", Font.BOLD, 20));
    //     titulo.setForeground(Color.WHITE);

    //     JLabel statuPlayer = new JLabel();
    //     statuPlayer.setForeground(Color.white);
    //     statuPlayer.setFont(new Font("Arial", Font.PLAIN, 18));

    //     // Atualiza o texto do status
    //     statuPlayer.setText(String.format(
    //             "<html>Ocupação Atual: %s | XP: %.1f / %.1f | Nível: %d | NetWork: %d<br></html>",
    //             player.getOccupation(),
    //             player.getXp(),
    //             player.getXpNeeded(),
    //             player.getLevel(),
    //             player.getNetwork_quantity()));

    //     StringBuilder sb = new StringBuilder("<html>");
    //     JLabel labelsActivitys = new JLabel();
    //     int i = 1;

    //     for (Activity activity : activityList) {
    //         sb.append(i)
    //                 .append(" - ")
    //                 .append(activity.toString())
    //                 .append("<br>"); // quebra de linha no JLabel
    //         i++;
    //     }

    //     sb.append("</html>");
    //     labelsActivitys.setText(sb.toString());
    //     labelsActivitys.setForeground(Color.WHITE);
    //     labelsActivitys.setFont(new Font("Arial", Font.PLAIN, 16));

    //     panelMain.add(titulo, BorderLayout.NORTH);
    //     panelMain.add(statuPlayer, BorderLayout.CENTER);
    //     panelMain.add(labelsActivitys, BorderLayout.SOUTH);

    //     mainMenu.add(panelMain, BorderLayout.CENTER);

    //     for (int idx = 0; idx < activityList.size(); idx++) {
    //         int indexFinal = idx;

    //         panelMain.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
    //                 .put(KeyStroke.getKeyStroke(String.valueOf(idx + 1)), "tecla" + (idx + 1));

    //         panelMain.getActionMap().put("tecla" + (idx + 1), new AbstractAction() {
    //             @Override
    //             public void actionPerformed(ActionEvent e) {
    //                 Activity a = activityList.get(indexFinal);

    //                 player.setXp(player.getXp() + a.getActivity_value());

    //                 statuPlayer.setText(String.format(
    //                         "<html>Ocupação Atual: %s | XP: %.1f / %.1f | Nível: %d | NetWork: %d<br></html>",
    //                         player.getOccupation(),
    //                         player.getXp(),
    //                         player.getXpNeeded(),
    //                         player.getLevel(),
    //                         player.getNetwork_quantity()));

    //                 // 🔥 Quando sobe de nível, o menu precisa atualizar!
    //                 if (player.getXp() == 0) {
    //                     mainMenu.dispose();
    //                     Lobby(player); // ← CHAMA DE NOVO PARA ATUALIZAR ATIVIDADES!
    //                 }
    //             }
    //         });
    //     }

    //     mainMenu.setVisible(true);
    // }

    static public void ShowMessageAlert(String mensage) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true); // garante que fique na frente

        JOptionPane.showMessageDialog(
                frame,
                mensage,
                "AVISO!",
                JOptionPane.WARNING_MESSAGE);

        frame.dispose();
    }

    static public void LevelUpMensage(Player player) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true); // garante que fique na frente

        JOptionPane.showMessageDialog(
                frame,
                "PARABENS! VOCÊ É AGORA: " + player.getLevelData().getName(),
                "AVISO!",
                JOptionPane.INFORMATION_MESSAGE);

        frame.dispose();
    }

    public static boolean showCarta(String nome) {

        AtomicBoolean go_place = new AtomicBoolean(false);

        JFrame frame = new JFrame("Convite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // ========== PAINEL PRINCIPAL ==========
        JPanel painelMain = new JPanel(new BorderLayout());
        painelMain.setBackground(new Color(30, 30, 30));
        painelMain.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // ========== TÍTULO ==========
        JLabel labelName = new JLabel(
                String.format("<html><h1 style='color:#4CAF50;'>Meu querido %s</h1></html>", nome),
                SwingConstants.CENTER
        );
        labelName.setForeground(new Color(76, 175, 80));
        labelName.setFont(new Font("Segoe UI", Font.BOLD, 28));
        labelName.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        // ========== TEXTO DA CARTA ==========
        JLabel labelInformation = new JLabel(
                "<html>" +
                "Se você está lendo isso, significa que você está desesperado por uma mudança na sua vida.<br><br>" +
                "Há muito tempo atrás, o mesmo aconteceu comigo. Eu perdi de vista o que mais importa na vida: " +
                "vínculos concretos com a natureza e outras pessoas. Foi então que decidi largar tudo e me mudar " +
                "para o meu verdadeiro lar.<br><br>" +
                "Em anexo você encontrará a escritura para esse lugar… meu orgulho e alegria: O Sítio do Pica-pau Amarelo.<br>" +
                "Ele fica no Vale do Orvalho, no litoral sul. É perfeito para começar a sua nova vida. " +
                "O meu bem mais precioso agora é seu. Eu sei que você vai honrar a nossa família, meu garoto. Boa sorte.<br><br>" +
                "Com amor,<br>" +
                "Vovó<br><br>" +
                "P.S.: Se o Lewis ainda estiver vivo, mande um Oi pelo seu corôa, tá?" +
                "</html>"
        );
        labelInformation.setForeground(new Color(224, 224, 224));
        labelInformation.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        labelInformation.setVerticalAlignment(SwingConstants.TOP);

        // ========== CAIXA DE TEXTO COM ESTILO ==========
        JPanel painelTextoWrapper = new JPanel(new BorderLayout());
        painelTextoWrapper.setBackground(new Color(45, 45, 45));
        painelTextoWrapper.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(76, 175, 80), 2, true),
                BorderFactory.createEmptyBorder(25, 30, 25, 30)
        ));
        painelTextoWrapper.add(labelInformation, BorderLayout.CENTER);

        // Junta título + texto
        JPanel painelTexto = new JPanel(new BorderLayout());
        painelTexto.setBackground(new Color(30, 30, 30));
        painelTexto.add(labelName, BorderLayout.NORTH);
        painelTexto.add(painelTextoWrapper, BorderLayout.CENTER);

        // ========== BOTÃO SIM ==========
        JButton botaoSim = new JButton("Ir para o Sítio");
        configurarBotao(botaoSim, new Color(76, 175, 80), new Color(67, 160, 71));

        botaoSim.addActionListener(e -> {
            go_place.set(true);
            frame.dispose();
        });

        // ========== BOTÃO NÃO ==========
        JButton botaoNao = new JButton("Continuar na Carreira de Programador");
        configurarBotao(botaoNao, new Color(145, 76, 80), new Color(160, 67, 71));

        botaoNao.addActionListener(e -> {
            go_place.set(false);
            frame.dispose();
        });

        // ========== PAINEL DOS BOTÕES ==========
        JPanel painelBotao = new JPanel();
        painelBotao.setBackground(new Color(30, 30, 30));
        painelBotao.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        painelBotao.add(botaoNao);
        painelBotao.add(botaoSim);

        // ========== ADICIONAR AO FRAME ==========
        painelMain.add(painelTexto, BorderLayout.CENTER);
        painelMain.add(painelBotao, BorderLayout.SOUTH);
        frame.add(painelMain, BorderLayout.CENTER);

        frame.setVisible(true);

        // Espera a janela fechar para retornar o valor
        while (frame.isVisible()) {
            try { Thread.sleep(100); } catch (Exception ignored) {}
        }

        return go_place.get();
    }

    private static void configurarBotao(JButton botao, Color corNormal, Color corHover) {
        botao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        botao.setPreferredSize(new Dimension(280, 45));
        botao.setBackground(corNormal);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}


