package escola;

import escola.application.matricular.MatricularAluno;
import escola.application.matricular.MatricularAlunoDTO;
import escola.domain.IAlunoRepository;
import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;
import escola.domain.aluno.Email;
import escola.infra.aluno.AlunosEmMemoriaRepository;

public class MatricularAlunoViaCLI {

    public static void main(String[] args) {
        //Exemplo de utilizacao por prompt ou interface web.
        // as validacoes de CPF por exemplo funcionam
        // regra isolada na camada de UseCases do clean architecture ou application.

        MatricularAluno matricularAluno = new MatricularAluno(new AlunosEmMemoriaRepository());
        MatricularAlunoDTO novoAluno = new MatricularAlunoDTO("000.000.000-12", "Jose", "aaaa@aaaa.com");
        matricularAluno.executa(novoAluno);
    }
}
