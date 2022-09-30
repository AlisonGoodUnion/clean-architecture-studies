package escola.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        isValid(ddd, numero);
        this.ddd = ddd;
        this.numero = numero;
    }

    private void isValid(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero sao obrigatorios");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalido");
        }
        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido");
        }
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

}
