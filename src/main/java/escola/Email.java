package escola;


//classe email nao é entidade pois nao tem um identificador unico
// e um Value Object
public class Email {

    private String endereco;

    private static final String REGEX_EMAIL = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$";

    public Email(String endereco) {
        if (endereco == null || !endereco.matches(REGEX_EMAIL)) {
            throw new IllegalArgumentException("Email invalido");
        }

        this.endereco = endereco;
    }
}
