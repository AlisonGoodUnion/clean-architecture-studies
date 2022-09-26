package escola;


//classe email nao é entidade pois nao tem um identificador unico
// e um Value Object Fonte: https://martinfowler.com/bliki/ValueObject.html
public class Email {

    private String endereco;

    private static final String REGEX_EMAIL = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+).(\\.[a-z]{2,3})$";

    public Email(String endereco) {
        if (endereco == null || !endereco.matches(REGEX_EMAIL)) {
            throw new IllegalArgumentException("Email invalido");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
