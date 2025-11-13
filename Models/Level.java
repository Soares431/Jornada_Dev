package Models;

import java.util.Arrays;
import java.util.List;

import Models.Activity;

public enum Level {

    INICIANTE(
            1,
            "INICIANTE",
            50,
            Arrays.asList(
                    new Activity(
                            "Fazer curso em vídeo",
                            "Conheça o Guanabara!",
                            15,
                            0,
                            0
                    ),
                    new Activity(
                            "Assistir palestra",
                            "Aprenda algo novo assistindo uma palestra ou TED.",
                            5,
                            0,
                            0
                    ),
                    new Activity(
                            "Zerar um jogo totalmente em inglês",
                            "Desafie-se a jogar e entender tudo em inglês — você ganha um Buff de XP!",
                            0,
                            1,
                            0
                    )
            )
    ),

    ESTUDANTE(
            2,
            "ESTUDANTE",
            100,
            Arrays.asList(
                    new Activity(
                            "Praticar atividade",
                            "Realize uma prática relacionada aos estudos.",
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Fazer revisão de disciplinas",
                            "Reforce o conteúdo estudado para melhorar a retenção.",
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Call entre amigos",
                            "Converse com amigos sobre estudos ou projetos. Melhora seu XP futuro.",
                            0,
                            1,
                            0
                    ),
                    new Activity(
                            "Fazer networking",
                            "Deixe de ser introvertido e faça novas conexões. ++Network (se tiver XP suficiente).",
                            0,
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Projeto pessoal",
                            "Crie um projeto prático simples.",
                            10,
                            0,
                            0
                    )
            )
    ),

    FREELANCE(
            3,
            "FREELANCE",
            150,
            Arrays.asList(
                    new Activity(
                            "Projeto pessoal (nível avançado)",
                            "Desenvolva um projeto mais complexo. Se tiver Network, XP += (XP * 2) / Network.",
                            20,
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Ir trabalhar",
                            "Trabalhe ou estagie. Ganhe experiência real e aumente o Network.",
                            30,
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Participar de um culto",
                            "Interaja e conheça novas pessoas. ++Network.",
                            0,
                            0,
                            0,
                            1
                    ),
                    new Activity(
                            "Fazer sistema Fullstack",
                            "Desenvolva um sistema completo com frontend e backend.",
                            50,
                            1,
                            0,
                            1
                    ),
                    new Activity(
                            "Formatação e tratamento de planilhas e dados",
                            "Organize e limpe dados de forma eficiente.",
                            25,
                            0,
                            0
                    ),
                    new Activity(
                            "Criar um programa simples",
                            "Crie um programa funcional pequeno (CLI, automação etc).",
                            5,
                            0,
                            0
                    )
            )
    );

    private final int level;
    private final String name;
    private final double XP_needed;
    private final List<Activity> Activitys;

    Level(int level, String name, double XP_needed, List<Activity> Activitys) {
        this.level = level;
        this.name = name;
        this.XP_needed = XP_needed;
        this.Activitys = Activitys;
    }

    public int getlevel() {
        return level;
    }

    public String getname() {
        return name;
    }

    public double getXP_needed() {
        return XP_needed;
    }

    public List<Activity> getActivitys() {
        return Activitys;
    }
}


