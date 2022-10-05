package escola.application.matricular;

import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;
import escola.infra.aluno.AlunosEmMemoriaRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {


    //integration test usecase
    //a clean architeure facilita os testes de integracao
    @Test
    void devePersistirAluno() {
        AlunosEmMemoriaRepository repository = new AlunosEmMemoriaRepository();
        MatricularAluno useCase = new MatricularAluno(repository);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("253.021.090-00",
                "Fulano",
                "fulano@fulano.com.br");
        useCase.executa(dados);

        Aluno encontrado = repository.buscarPorCPF(new CPF("253.021.090-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("253.021.090-00", encontrado.getCpf());
        assertEquals("fulano@fulano.com.br", encontrado.getEmail());
    }

}
