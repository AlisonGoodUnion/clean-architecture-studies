package escola;


/**
 * o domain tem que ser distinto por isso usar o ID como identificador é errado
 * pois não sabemos qual vai ser a nossa base de dados/infra.
 * Pessoal da área de negócio usa CPF como identificador unico,
 * quanto mais proximo ao real melhor.
 *
 *
 */

public class Aluno {
    private String cpf;
    private String nome;
    private Email email;
}
