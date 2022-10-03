package escola.domain.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlunoTest {

    @Test
    void deveAdicionarTelefonesAoAluno() {

        Aluno aluno = new Aluno(new CPF("253.021.090-00"),
                "Jose Inacio",
                new Email("aaa@aaa.com.br"));
        aluno.addTelefone("55", "12345678");

        Assertions.assertEquals("253.021.090-00", aluno.getCpf().getNumero());
        Assertions.assertEquals("aaa@aaa.com.br", aluno.getEmail().getEndereco());
        Assertions.assertEquals("Jose Inacio", aluno.getNome());
        Assertions.assertEquals(1, aluno.getTelefones().size());
        Assertions.assertEquals("55", aluno.getTelefones().get(0).getDdd());
        Assertions.assertEquals("12345678", aluno.getTelefones().get(0).getNumero());
    }
}
