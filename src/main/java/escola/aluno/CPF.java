package escola.aluno;


//classe email nao é entidade pois nao tem um identificador unico
// e um Value Object Fonte: https://martinfowler.com/bliki/ValueObject.html
public class CPF {

    private String numero;

    private static final String REGEX_CPF = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

    public CPF(String numero) {
        if (numero == null || !numero.matches(REGEX_CPF)) {
            throw new IllegalArgumentException("CPF invalido");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
