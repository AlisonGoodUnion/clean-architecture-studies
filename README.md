# clean-architecture-studies
Estudos sobre Arquitetura - (Limpa - Hexagonal - Onion).

FONTE: https://cursos.alura.com.br/course/java-clean-architecture

`Arquitetura?`

    A definição de arquitetura de software é muito subjetiva, 
    sendo que na literatura encontramos diversos autores com diferentes pontos de vista
    opiniões e definições sobre o tema.    

    Tem uma que é um padrão do IEEE, o 1471-2000, que fala
    que a arquitetura pode ser definida como aquelas práticas e fundamentos de como você organiza um sistema,
    em relação aos seus componentes, a relação entre eles, questão de ambientes e como vai ser gerenciado 
    o design e a evolução desse software em relação ao código.
    Então já temos uma visão bem interessante sobre arquitetura de software.

    * (code -> design -> architecture):
        * Componentes do software e suas relações;
        * Infraestrutura do software;
        * Estrutura e design do código;
        * Suporte aos requisitos de negócio;
        * Simplificar evoluções no software;
    
    * Fortemente relacionada aos Requisitos não Funcionais do software:
        * Performance
        * Escalabilidade;
        * Disponibilidade;
        * Confiabilidade;
        * Segurança;
        * Etc;
    * Requisitos não Funcionais Negligenciados:
        ?A arquitetura favorece esses dois requisitos?
        * Manutenibilidade; (capacidade de dar manutenção e aplicar ajustes, melhorias e correções pontuais.)
        * Extensibilidade; (capacidade de estender o software adicionando comportamentos ou funcionalidades.)
        Obs: a tendência é o software crescer e se não tomarmos cuidado com esses dois pontos
        todas as mudanças futuras ficam mais difíceis, deixando o trabalho mais lento e sujeito a erros.

    Referências: https://resources.sei.cmu.edu/library/asset-view.cfm?assetid=513807


Visão geral da Clean Architecture.
    
    Um Modelo de arquitetura:
        *  Arquitetura em Camadas: Semelhante ao (MVC: UI -> Business -> Data)
        *  Onion Architecture: (Core Domain Model -> Domain Services -> Application Services -> User Interface -> (Tests/Infra))
        *  Hexagonal Architecture: Semelhante ao Onion ( no centro application/domain/model -> Infra -> 
            comunicações ports (entrada ao domain) por adapters (conversão/ponto com os dois mundos fora/dentro))
            tem como objetivo isolar o domínio da aplicação.
        * Clean Architecture: une o melhor dos dois mundos, onion + hexagonal. 
            Entities -> Use Cases -> (Controllers, Presenters, Gateways) -> (Devices, Web, UI, DB, External Interfaces): Uncle Bob.

    Vantagens Clean Architecture:
        * Isolar o código de domínio da aplicação;
        * Inversão de dependências; as regras que interagem com o domain utilizando interfaces.
        * Favorece boas práticas de Orientação a Objetos;
        * Código de domínio com alta "Testabilidade";
        * Independe de frameworks e detalhes de infraestrutura;(caso queira trocar de Oracle para PostGresql fica mais fácil e o domain fica isolado)

    Obs: caso não seguir uma boa arquitetura tudo fica amarrado e preso a infra dificultando manutenção, evolução de forma mais agil, dificulta testes etc...  




Projeto do Curso: Funcionalidades Escola usando clean architecture.

    * Matricular alunos;
    * Cadastrar telefones dos alunos;
    * Indicação de alunos;
    * Etc;

Infra necessária

    * Java 11
    * Gradle
        
Arquitetura Gritante - Screaming Arch:

    Pacotes são uma ferramenta essencial para toda arquitetura. 
    Benefícios: uma estrutura mais robusta de módulos
    https://blog.cleancoder.com/uncle-bob/2011/09/30/Screaming-Architecture.html

    Suas arquiteturas devem informar aos leitores sobre o sistema, não sobre os frameworks que você usou em seu sistema.
    “Ah, este é um sistema de saúde”
