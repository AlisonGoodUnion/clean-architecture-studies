package escola.domain.aluno.exception;

import escola.domain.aluno.CPF;

//podemos criar exception no domain, e sera usada na infra, lembrando que a infra
//usa classes do domain camada externa acessa interna ;) .
public class AlunoNaoEncontradoException extends RuntimeException {

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }
}
