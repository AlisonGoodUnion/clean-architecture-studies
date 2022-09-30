package escola;

//da para melhorar bastante essa class,  um dos problemas é ordem de utilizacao dos metodos.
public class AlunoBuilder {

    private Aluno aluno;

    public AlunoBuilder comNomeCPFEmail(String cpf, String nome, Email email) {
        this.aluno = new Aluno(new CPF(cpf), nome, email);
        return this;
    }

    public AlunoBuilder comTelefone(String ddd, String numero) {
        this.aluno.addTelefone(ddd,numero);
        return this;
    }

    private Aluno build() {
        return this.aluno;
    }
}
