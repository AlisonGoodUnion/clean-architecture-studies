package escola;

import java.util.ArrayList;
import java.util.List;

/**
 * o domain tem que ser distinto por isso usar o ID como identificador é errado
 * pois não sabemos qual vai ser a nossa base de dados/infra.
 * Pessoal da área de negócio usa CPF como identificador unico,
 * quanto mais proximo ao real melhor.
 */

public class Aluno {
    //uma das dificuldades é saber diferenciar uma
    //entidade de uma entity no java que geralmente é um espelho de uma table.
    //so que aqui estamos nos referindo a camada de negócio.
    private String cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public void addTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
}
