package escola.indicacao;

import escola.aluno.Aluno;
import escola.aluno.AlunoBuilder;
import escola.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndicacaoTest {

    @Test
    void deveCriarIndicacoe() {

        Aluno indicado = new AlunoBuilder().comNomeCPFEmail(
                "253.021.090-00",
                "Jose",
                new Email("aaa@aaa.com.br")).build();
        Aluno indicante = new AlunoBuilder().comNomeCPFEmail(
                "253.021.090-00",
                "Marcos",
                new Email("aaa@aaa.com.br")).build();
        Indicacao indicacao = new Indicacao(indicado, indicante);

        assertEquals("Jose", indicado.getNome());
        assertEquals("Marcos", indicante.getNome());
    }

}
