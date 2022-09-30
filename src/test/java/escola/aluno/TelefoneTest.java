package escola.aluno;


import escola.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void deveCriarTelefoneCom8Digitos() {
        Telefone telefone = new Telefone("55", "12345678");
        assertEquals("55", telefone.getDdd());
        assertEquals("12345678", telefone.getNumero());
    }

    @Test
    void deveCriarTelefoneCom9Digitos() {
        Telefone telefone = new Telefone("55", "123456789");
        assertEquals("55", telefone.getDdd());
        assertEquals("123456789", telefone.getNumero());
    }

    @Test
    void naoDeveCriarTelefoneSemDDD() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Telefone telefone = new Telefone(null, "123456789");
        });
        assertEquals("DDD e Numero sao obrigatorios", exception.getMessage());
    }

    @Test
    void naoDeveCriarTelefoneSemNumero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Telefone telefone = new Telefone("255", null);
        });
        assertEquals("DDD e Numero sao obrigatorios", exception.getMessage());
    }

    @Test
    void naoDeveCriarTelefoneComDDDMaiorQue2Digitos() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Telefone telefone = new Telefone("255", "123456789");
        });
        assertEquals("DDD invalido", exception.getMessage());
    }

    @Test
    void naoDeveCriarTelefoneComNumeroMaiorQue9Digitos() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Telefone telefone = new Telefone("55", "1234567896");
        });
        assertEquals("Numero invalido", exception.getMessage());
    }

    @Test
    void naoDeveCriarTelefoneComNumeroMenorQue8Digitos() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Telefone telefone = new Telefone("55", "1234567");
        });
        assertEquals("Numero invalido", exception.getMessage());
    }

}
