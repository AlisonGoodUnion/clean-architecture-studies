package escola;

public class Indicacao {

    //ao inves de chamar aluno1 e aluno2 devemos utilizar os mesmos termos
    //indicado e indicante.
    private Aluno indicado;
    private Aluno indicante;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }
}
