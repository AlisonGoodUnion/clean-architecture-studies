package escola.infra.aluno;

import escola.domain.IAlunoRepository;
import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;
import escola.domain.aluno.exception.AlunoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

//implementacao em memoria do repositorio de alunos sem alterar nada na camada de dominio
//
public class AlunosEmMemoriaRepository implements IAlunoRepository {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream().filter(
                aluno ->
                        aluno.getCpf().equals(cpf.getNumero())).findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
    }

    @Override
    public List<Aluno> matriculados() {
        return this.matriculados;
    }
}
