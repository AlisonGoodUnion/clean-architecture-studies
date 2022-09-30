package escola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CPFTest {

    @Test
    void deveCriarCPF() {
        CPF cpf = new CPF("253.021.090-00");
        assertEquals("253.021.090-00", cpf.getNumero());
    }

    @Test
    void naoDeveCriarCPFSemMasc() {
        IllegalArgumentException error = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new CPF("25302109000");
        });
        assertEquals("CPF invalido", error.getMessage());
    }

    @Test
    void naoDeveCriarCPFNull() {
        IllegalArgumentException error = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new CPF(null);
        });
        assertEquals("CPF invalido", error.getMessage());
    }
}
