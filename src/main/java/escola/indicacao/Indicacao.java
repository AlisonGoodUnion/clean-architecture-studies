package escola.indicacao;

import escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    //ao inves de chamar aluno1 e aluno2 devemos utilizar os mesmos termos
    //indicado e indicante.
    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime data;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.data = LocalDateTime.now();
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public LocalDateTime getData() {
        return data;
    }
}
