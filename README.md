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

