package escola.aluno;

import escola.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void naoDeveCriarEmailInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new Email(null));
        assertThrows(IllegalArgumentException.class, () ->
                new Email(""));
        assertThrows(IllegalArgumentException.class, () ->
                new Email("emailinvalido"));
    }

    @Test
    void deveCriarEmailValido() {
        Email email = new Email("aaa@aaa.com.br");
        assertEquals("aaa@aaa.com.br", email.getEndereco());
    }

}
