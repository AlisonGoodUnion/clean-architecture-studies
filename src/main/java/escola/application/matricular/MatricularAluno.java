package escola.application.matricular;

import escola.domain.IAlunoRepository;
import escola.domain.aluno.Aluno;

public class MatricularAluno {

    private final IAlunoRepository repository;

    public MatricularAluno(IAlunoRepository repository) {
        this.repository = repository;
    }

    //lembra o pattern command
    //evitamos replicacao de codigo e representada na camada de aplicacao
    public void executa(MatricularAlunoDTO alunoDTO) {
        Aluno novo = alunoDTO.criarAluno();
        repository.matricular(novo);
    }
}
