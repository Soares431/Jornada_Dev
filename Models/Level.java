package Models;

import java.util.ArrayList;
import java.util.Arrays;

public enum Level {

    // ==================== NÍVEL 1: ESTUDANTE ====================
    ESTUDANTE(
            1,
            "ESTUDANTE",
            0,      // XP necessário para alcançar este nível
            50,     // XP necessário para próximo nível
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Praticar lógica de programação",
                            "Resolva exercícios básicos de algoritmos.",
                            5.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(3, "PENSAMENTO LÓGICO", 5),
                                    new Skill(2, "ESTRUTURAS DE DADOS E ALGORITMOS", 3)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Fazer revisão de disciplinas",
                            "Reforce o conteúdo estudado para melhorar a retenção.",
                            3.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 4)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Participar de grupo de estudos",
                            "Converse com colegas sobre conceitos e projetos.",
                            4.0,
                            1,
                            false,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(1, "COMUNICAÇÃO", 3),
                                    new Skill(1, "NETWORK", 2)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Assistir tutoriais online",
                            "Aprenda com vídeos e cursos gratuitos.",
                            3.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 3),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 2)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Criar projeto pessoal simples",
                            "Desenvolva uma calculadora ou to-do list.",
                            8.0,
                            0,
                            false,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 5),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 4)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 2: ESTAGIÁRIO ====================
    ESTAGIARIO(
            2,
            "ESTAGIÁRIO",
            50,     // XP necessário para alcançar este nível
            125,    // XP necessário para próximo nível (+75)
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Corrigir bugs simples",
                            "Analise e resolva erros básicos no código.",
                            8.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 4),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 3)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Documentar código existente",
                            "Adicione comentários e documentação técnica.",
                            6.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 5)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Fazer code review com supervisor",
                            "Aprenda boas práticas revisando código.",
                            7.0,
                            1,
                            false,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 4),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 3)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Participar de daily meetings",
                            "Relate seu progresso e bloqueios para o time.",
                            5.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 6),
                                    new Skill(1, "NETWORK", 3)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Implementar feature simples",
                            "Desenvolva uma funcionalidade básica no projeto.",
                            10.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 5),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 5),
                                    new Skill(4, "BANCOS DE DADOS", 3)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 3: JÚNIOR ====================
    JUNIOR(
            3,
            "JÚNIOR",
            125,    // XP necessário para alcançar este nível
            200,    // XP necessário para próximo nível (+75)
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Implementar endpoint REST para cadastro de usuários",
                            "Crie APIs RESTful usando ORM para persistência.",
                            12.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 6),
                                    new Skill(4, "BANCOS DE DADOS", 5),
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 3)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Criar testes unitários básicos",
                            "Implemente testes com JUnit/PyTest/Jest.",
                            10.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 6),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 4)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Ajustar CSS quebrado em componentes responsivos",
                            "Corrija problemas de layout e responsividade.",
                            8.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 4)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Corrigir erro 500 analisando stack trace",
                            "Debug de erros no backend usando logs.",
                            11.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 7),
                                    new Skill(4, "BANCOS DE DADOS", 4)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Documentar rotas no Swagger/OpenAPI",
                            "Crie documentação técnica de APIs.",
                            9.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 7),
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 4)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 4: PLENO ====================
    PLENO(
            4,
            "PLENO",
            200,    // XP necessário para alcançar este nível
            275,    // XP necessário para próximo nível (+75)
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Refatorar serviço para reduzir latência usando cache Redis",
                            "Otimize performance com estratégias de cache.",
                            15.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 7),
                                    new Skill(4, "BANCOS DE DADOS", 6),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 5)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Criar pipeline CI para rodar testes e lint automático",
                            "Implemente integração contínua com automação.",
                            14.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 6),
                                    new Skill(5, "PENSAMENTO LÓGICO", 5)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Otimizar consulta SQL adicionando índices e EXPLAIN",
                            "Melhore performance do banco de dados.",
                            13.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(4, "BANCOS DE DADOS", 8),
                                    new Skill(5, "PENSAMENTO LÓGICO", 6)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Implementar autenticação JWT com refresh token",
                            "Desenvolva sistema de autenticação seguro.",
                            16.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 7),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 6)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Criar feature completa com backend + frontend + mensageria",
                            "Desenvolva funcionalidade end-to-end com Kafka/RabbitMQ.",
                            18.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 8),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 7),
                                    new Skill(4, "BANCOS DE DADOS", 6),
                                    new Skill(2, "COMUNICAÇÃO", 5)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 5: SÊNIOR ====================
    SENIOR(
            5,
            "SÊNIOR",
            275,    // XP necessário para alcançar este nível
            350,    // XP necessário para próximo nível (+75)
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Definir arquitetura de microsserviços com comunicação assíncrona",
                            "Projete sistemas distribuídos escaláveis.",
                            20.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 10),
                                    new Skill(4, "BANCOS DE DADOS", 7),
                                    new Skill(2, "COMUNICAÇÃO", 6)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Realizar análise de incidente com RCA e plano de mitigação",
                            "Investigue falhas críticas e proponha soluções.",
                            18.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(5, "PENSAMENTO LÓGICO", 9),
                                    new Skill(2, "COMUNICAÇÃO", 8),
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 7)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Projetar estratégia de sharding e replicação no banco",
                            "Implemente escalabilidade horizontal de dados.",
                            19.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(4, "BANCOS DE DADOS", 10),
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 8)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Criar padrões de logging, tracing e monitoramento distribuído",
                            "Estabeleça observabilidade em sistemas complexos.",
                            17.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 9),
                                    new Skill(3, "ESTRUTURAS DE DADOS E ALGORITMOS", 7)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Escrever ADRs definindo escolhas técnicas para o projeto",
                            "Documente decisões arquiteturais importantes.",
                            16.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 10),
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 8),
                                    new Skill(1, "NETWORK", 5)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 6: TECH LEAD ====================
    TECH_LEAD(
            6,
            "TECH LEAD",
            350,    // XP necessário para alcançar este nível
            425,    // XP necessário para próximo nível (+75)
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Liderar revisão de arquitetura do projeto",
                            "Conduza reuniões técnicas e tome decisões de design.",
                            22.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 10),
                                    new Skill(2, "COMUNICAÇÃO", 9),
                                    new Skill(1, "NETWORK", 7)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Mentorar desenvolvedores júnior e pleno",
                            "Faça pair programming e compartilhe conhecimento.",
                            20.0,
                            1,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 10),
                                    new Skill(1, "NETWORK", 8)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Definir roadmap técnico trimestral",
                            "Planeje evolução tecnológica do produto.",
                            21.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 9),
                                    new Skill(2, "COMUNICAÇÃO", 8),
                                    new Skill(5, "PENSAMENTO LÓGICO", 7)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Coordenar migração de sistema legado",
                            "Gerencie refatoração de grande escala.",
                            24.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(6, "ARQUITETURA DE SOFTWARE", 10),
                                    new Skill(4, "BANCOS DE DADOS", 8),
                                    new Skill(2, "COMUNICAÇÃO", 9)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Participar de reuniões estratégicas com stakeholders",
                            "Traduza necessidades de negócio em soluções técnicas.",
                            19.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 10),
                                    new Skill(1, "NETWORK", 9)
                            ))
                    )
            ))
    ),

    // ==================== NÍVEL 9: CEO ====================
    CEO(
            7,
            "CEO",
            575,    // XP necessário para alcançar este nível
            0,      // Nível máximo - sem próximo nível
            new ArrayList<>(Arrays.asList(
                    // Atividade 1
                    new Activity(
                            "Definir visão estratégica da empresa",
                            "Lidere a direção completa do negócio.",
                            35.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 15),
                                    new Skill(1, "NETWORK", 15),
                                    new Skill(5, "PENSAMENTO LÓGICO", 12)
                            ))
                    ),

                    // Atividade 2
                    new Activity(
                            "Captar investimento Series A/B/C",
                            "Negocie com VCs e apresente pitch para investidores.",
                            38.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 16),
                                    new Skill(1, "NETWORK", 16)
                            ))
                    ),

                    // Atividade 3
                    new Activity(
                            "Construir cultura organizacional",
                            "Defina valores e processos da empresa.",
                            33.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(2, "COMUNICAÇÃO", 14),
                                    new Skill(1, "NETWORK", 13)
                            ))
                    ),

                    // Atividade 4
                    new Activity(
                            "Liderar M&A (fusões e aquisições)",
                            "Expanda através de aquisições estratégicas.",
                            40.0,
                            0,
                            true,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(1, "NETWORK", 17),
                                    new Skill(2, "COMUNICAÇÃO", 15),
                                    new Skill(5, "PENSAMENTO LÓGICO", 13)
                            ))
                    ),

                    // Atividade 5
                    new Activity(
                            "Preparar IPO da empresa",
                            "Conduza processo de abertura de capital.",
                            42.0,
                            0,
                            false,
                            new ArrayList<>(Arrays.asList(
                                    new Skill(1, "NETWORK", 18),
                                    new Skill(2, "COMUNICAÇÃO", 17),
                                    new Skill(5, "PENSAMENTO LÓGICO", 14)
                            ))
                    )
            ))
    );



    private final int level;
    private final String name;
    private final int xpRequired;
    private final int xpForNext;
    private final ArrayList<Activity> activities;

    Level(int level, String name, int xpRequired, int xpForNext, ArrayList<Activity> activities) {
        this.level = level;
        this.name = name;
        this.xpRequired = xpRequired;
        this.xpForNext = xpForNext;
        this.activities = activities;
    }

    // ==================== GETTERS ====================
    public int getLevel() { return level; }
    public String getName() { return name; }
    public int getXpRequired() { return xpRequired; }
    public int getXpForNext() { return xpForNext; }
    public ArrayList<Activity> getActivities() { return activities; }
}


